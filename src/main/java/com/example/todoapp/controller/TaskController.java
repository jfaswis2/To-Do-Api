package com.example.todoapp.controller;

import com.example.todoapp.persistence.entity.Task;
import com.example.todoapp.service.TaskService;
import com.example.todoapp.service.dto.TaskInDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody TaskInDTO taskInDTO){
        return this.taskService.createTask(taskInDTO);
    }

    @GetMapping
    public List<Task> findAll(){
        return this.taskService.findAll();
    }

}
