package service.impl;

import model.User;
import model.dto.UserDTO;
import repository.CrudRepository;
import repository.impl.UserRepositoryImpl;
import service.UserService;
import utils.UserMapper;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private CrudRepository<User> userRepository;

    public UserServiceImpl(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void createUser(UserDTO userDTO) {
        User user = UserMapper.toUser(userDTO);
        userRepository.add(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.getAll();
        return users.stream().map(UserMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public void editUser(UserDTO userDTO) {
        User user = UserMapper.toUser(userDTO);
        userRepository.update(user);
    }

    @Override
    public void removeUser(UserDTO userDTO) {
        User user = UserMapper.toUser(userDTO);
        userRepository.delete(user);
    }
}
