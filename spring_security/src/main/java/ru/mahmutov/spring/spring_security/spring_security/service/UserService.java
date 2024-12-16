package ru.mahmutov.spring.spring_security.spring_security.service;

import ru.mahmutov.spring.spring_security.spring_security.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);

    User userById(int id);

    void update(int id, User updatedUser);

    void delete(int id);
}