package ru.mahmutov.spring.spring_security.spring_security.DAO;

import ru.mahmutov.spring.spring_security.spring_security.models.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void save(User user);

    User userById(int id);

    void update(int id, User updatedUser);

    void delete(int id);
}