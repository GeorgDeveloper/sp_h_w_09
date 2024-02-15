package ru.georgdeveloper.userapp.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.georgdeveloper.userapp.models.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findByEmail(String email);
}
