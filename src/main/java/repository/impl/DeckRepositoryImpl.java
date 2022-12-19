package repository.impl;

import config.ConnectionFactory;
import model.Deck;
import repository.CrudRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeckRepositoryImpl implements CrudRepository<Deck> {
    @Override
    public void add(Deck deck) {
        try {

            Connection connection = new ConnectionFactory().getConnection();
            String sql = "insert into deck (deck_name, deck_type, deck_cards, user_id) values (?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, deck.getDeckName());
            stmt.setString(2, deck.getDeckType());
            stmt.setString(3, deck.getDeckCards());
            stmt.setInt(4, deck.getUserId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Deck> getAll() {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            ResultSet result = connection.createStatement().executeQuery("select * from deck");
            List<Deck> decks = new ArrayList<>();
            while (result.next()) {
                Deck deck = new Deck();
                deck.setId(result.getInt("id"));
                deck.setDeckName(result.getString("deck_name"));
                deck.setDeckType(result.getString("deck_type"));
                deck.setDeckCards(result.getString("deck_cards"));
                deck.setUserId(result.getInt("user_id"));
                decks.add(deck);
            }
            return decks;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }

    @Override
    public void update(Deck deck) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "update deck set deck_name = ?, deck_type = ?, deck_cards = ?, user_id = ? where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, deck.getDeckName());
            stmt.setString(2, deck.getDeckType());
            stmt.setString(3, deck.getDeckCards());
            stmt.setInt(4, deck.getUserId());
            stmt.setInt(5, deck.getId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void delete(Deck deck) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "delete from deck where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, deck.getId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
