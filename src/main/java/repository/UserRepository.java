package repository;

import model.User;

import java.util.List;

public interface UserRepository {

    void add(User user);

    List<User> getAll();

    void update(User user);

    void delete(User user);

}
