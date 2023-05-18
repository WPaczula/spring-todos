package com.wojtek.todos.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wojtek.todos.entities.Todo;
import com.wojtek.todos.repositories.TodosRepository;

@RestController()
@RequestMapping("/todos")
public class TodosController {
    TodosRepository todosRepository;

    public TodosController(TodosRepository todosRepository) {
        this.todosRepository = todosRepository;
    }

    @GetMapping()
    public ResponseEntity<List<Todo>> getTodos() {
        var todos = (List<Todo>) todosRepository.findAll();

        return ResponseEntity.ok(todos);
    }
}
