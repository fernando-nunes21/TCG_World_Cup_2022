package repository.impl;

import config.ConnectionFactory;
import model.Game;
import repository.CrudRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GameRepositoryImpl implements CrudRepository<Game> {
    @Override
    public void add(Game game) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "insert into game (game_status, user_lifepoints, enemy_lifepoints, user_deck_name, " +
                    "dt_started, dt_finished, user_id) values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, game.getGameStatus());
            stmt.setInt(2, game.getUserLifePoints());
            stmt.setInt(3, game.getEnemyLifePoints());
            stmt.setString(4, game.getUsedDeckName());
            stmt.setDate(5, game.getDtStarted());
            stmt.setDate(6, game.getDtFinished());
            stmt.setInt(7, game.getUserId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Game> getAll() {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            ResultSet result = connection.createStatement().executeQuery("select * from game");
            List<Game> games = new ArrayList<>();
            while (result.next()) {
                Game game = new Game();
                game.setId(result.getInt("id"));
                game.setGameStatus(result.getString("game_status"));
                game.setUserLifePoints(result.getInt("user_lifepoints"));
                game.setEnemyLifePoints(result.getInt("enemy_lifepoints"));
                game.setUsedDeckName(result.getString("used_deck_name"));
                game.setDtStarted(result.getDate("dt_started"));
                game.setDtFinished(result.getDate("dt_finished"));
                game.setUserId(result.getInt("user_id"));
                games.add(game);
            }
            return games;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }

    @Override
    public void update(Game game) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "update game set game_status = ?, user_lifepoints = ?, enemy_lifepoints = ?, " +
                    "used_deck_name = ?, dt_started = ?, dt_finished = ?, user_id = ? where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, game.getGameStatus());
            stmt.setInt(2, game.getUserLifePoints());
            stmt.setInt(3, game.getEnemyLifePoints());
            stmt.setString(4, game.getUsedDeckName());
            stmt.setDate(5, game.getDtStarted());
            stmt.setDate(6, game.getDtFinished());
            stmt.setInt(7, game.getUserId());
            stmt.setInt(8, game.getId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void delete(Game game) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "delete from game where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, game.getId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
