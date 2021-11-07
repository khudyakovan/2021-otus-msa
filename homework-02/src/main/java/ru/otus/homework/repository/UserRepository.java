package ru.otus.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.homework.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
