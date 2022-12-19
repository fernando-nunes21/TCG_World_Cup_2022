package service;

import model.User;
import model.dto.UserDTO;

import java.util.List;

public interface UserService {

    void createUser(UserDTO user);

    List<UserDTO> getAllUsers();

    void editUser(UserDTO user);

    void removeUser(UserDTO user);
}
