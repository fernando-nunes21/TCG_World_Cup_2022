package repository.impl;

import config.ConnectionFactory;
import model.User;
import repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void add(User user) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "insert into user (username, email, pass, user_role) values (?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPass());
            stmt.setString(4, user.getUserRole());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
