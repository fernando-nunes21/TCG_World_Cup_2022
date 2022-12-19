package utils;

import model.User;
import model.dto.UserDTO;

public class UserMapper {

    static public User toUser(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPass(userDTO.getPass());
        user.setUserRole(userDTO.getUserRole());
        return user;
    }

    static public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setPass(user.getPass());
        userDTO.setUserRole(user.getUserRole());
        return userDTO;
    }
}
