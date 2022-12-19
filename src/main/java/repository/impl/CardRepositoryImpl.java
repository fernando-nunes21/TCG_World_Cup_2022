package repository.impl;

import config.ConnectionFactory;
import model.Card;
import repository.CrudRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CardRepositoryImpl implements CrudRepository<Card> {

    @Override
    public void add(Card card) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "insert into card (card_name, card_type, card_atk, card_def, card_stars, " +
                    "card_power_effects, card_file_name) values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, card.getCardName());
            stmt.setString(2, card.getCardType());
            stmt.setInt(3, card.getCardAtk());
            stmt.setInt(4, card.getCardDef());
            stmt.setInt(5, card.getCardStars());
            stmt.setString(6, card.getCardPowerEffects());
            stmt.setString(7, card.getCardFileName());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Card> getAll() {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            ResultSet result = connection.createStatement().executeQuery("select * from card");
            List<Card> cards = new ArrayList<>();
            while (result.next()) {
                Card card = new Card();
                card.setId(result.getInt("id"));
                card.setCardName(result.getString("card_name"));
                card.setCardType(result.getString("card_type"));
                card.setCardAtk(result.getInt("card_atk"));
                card.setCardDef(result.getInt("card_def"));
                card.setCardStars(result.getInt("card_stars"));
                card.setCardPowerEffects(result.getString("card_power_effects"));
                card.setCardFileName(result.getString("card_file_name"));
                cards.add(card);
            }
            return cards;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }

    @Override
    public void update(Card card) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "update card set card_name = ?, card_type = ?, card_atk = ?, card_def = ?, card_stars = ?, " +
                    "card_power_effects = ?, card_file_name = ? where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, card.getCardName());
            stmt.setString(2, card.getCardType());
            stmt.setInt(3, card.getCardAtk());
            stmt.setInt(4, card.getCardDef());
            stmt.setInt(5, card.getCardStars());
            stmt.setString(6, card.getCardPowerEffects());
            stmt.setString(7, card.getCardFileName());
            stmt.setInt(8, card.getId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void delete(Card card) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "delete from card where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, card.getId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
