package ru.georgdeveloper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequiredArgsConstructor
public class WebController {

    private final String tasksServiceUrl = "http://localhost:8080/tasks/";
    private final String usersServiceUrl = "http://localhost:8080/users/";


    private final RestTemplate restTemplate;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", restTemplate.getForObject(tasksServiceUrl, String.class));
        model.addAttribute("users", restTemplate.getForObject(usersServiceUrl, String.class));
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }



}