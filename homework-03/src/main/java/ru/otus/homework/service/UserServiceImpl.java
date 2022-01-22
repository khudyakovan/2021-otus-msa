package ru.otus.homework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.otus.homework.entity.User;
import ru.otus.homework.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    @Autowired
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(long userId) {
        return userRepository.getById(userId);
    }

    @Override
    public void deleteById(long userId) {
        userRepository.deleteById(userId);
    }
}
