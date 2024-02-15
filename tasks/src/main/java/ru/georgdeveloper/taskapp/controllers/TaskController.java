package ru.georgdeveloper.taskapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.georgdeveloper.taskapp.models.Task;
import ru.georgdeveloper.taskapp.services.TaskService;


import java.util.List;

/**
 * @tasks - отображение всех необходимых параметров
 *
 * @createTask - создание задачи
 *
 */

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/create_task")
    public boolean createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

}