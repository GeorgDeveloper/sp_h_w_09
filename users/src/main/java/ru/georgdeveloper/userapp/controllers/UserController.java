package ru.georgdeveloper.userapp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.georgdeveloper.userapp.models.User;
import ru.georgdeveloper.userapp.services.UserService;

import java.util.List;

/**
 * @login - форма авторизации пользователя
 * @registration - форма регистрации пользователя
 * @createUser - создание пользователя
 * @userInfo - информация о пользователе
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;


    @PostMapping("/registration")
    public ResponseEntity<String> createUser(User user) {
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/login")
    public boolean login() {
        return true;
    }
    @GetMapping("/")
    public List<User> findUsers() {
        return userService.findAll();
    }

    @PostMapping("/find_user/{id}")
    public User findUser(@PathVariable long id) {
        return userService.findUserById(id);
    }

    @PostMapping("/dell_user/{id}")
    public boolean createUser(@PathVariable long id) {
        return userService.dell(id);
    }




}
