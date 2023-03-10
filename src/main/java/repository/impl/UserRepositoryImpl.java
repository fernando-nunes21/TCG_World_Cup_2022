package repository.impl;

import config.ConnectionFactory;
import model.User;
import repository.CrudRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements CrudRepository<User> {

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
        try {
            Connection connection = new ConnectionFactory().getConnection();
            ResultSet result = connection.createStatement().executeQuery("select * from user");
            List<User> users = new ArrayList<>();
            while (result.next()) {
                User user = new User();
                user.setId(result.getInt("id"));
                user.setUsername(result.getString("username"));
                user.setEmail(result.getString("email"));
                user.setPass(result.getString("pass"));
                user.setUserRole(result.getString("user_role"));
                users.add(user);
            }
            return users;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }

    @Override
    public void update(User user) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "update user set username = ?, email = ?, pass = ?, user_role = ? where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPass());
            stmt.setString(4, user.getUserRole());
            stmt.setInt(5, user.getId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void delete(User user) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "delete from user where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, user.getId());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
