package com.example.todoapp.service;

import com.example.todoapp.mapper.TaskInDTOToTask;
import com.example.todoapp.persistence.entity.Task;
import com.example.todoapp.persistence.repository.TaskRepository;
import com.example.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDTO){
        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
    }
}
