package ru.georgdeveloper.userapp.repositpry;

import ru.georgdeveloper.userapp.enums.Status;
import ru.georgdeveloper.userapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {
    Task findByNameTask(String name);
    List<Task> findTaskByStatus(Status status);
    List<Task> findTaskByExecutors(User userByPrincipal);
}
