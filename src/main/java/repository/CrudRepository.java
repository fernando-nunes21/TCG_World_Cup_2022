package repository;

import model.User;

import java.util.List;

public interface CrudRepository<T> {

    void add(T T);

    List<T> getAll();

    void update(T T);

    void delete(T T);

}
