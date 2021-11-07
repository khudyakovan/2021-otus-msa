package ru.otus.homework.service;

import ru.otus.homework.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();

    User findUserById(long userId);

    void deleteById(long userId);
}
