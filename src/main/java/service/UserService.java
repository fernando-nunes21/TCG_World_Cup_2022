package service;

import model.dto.UserDTO;

import java.util.List;

public interface UserService {

    void createUser(UserDTO userDTO);

    List<UserDTO> getAllUsers();

    void editUser(UserDTO userDTO);

    void removeUser(UserDTO userDTO);
}
