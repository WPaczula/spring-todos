package com.wojtek.todos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wojtek.todos.dto.NewTodoDTO;
import com.wojtek.todos.dto.TodoDTO;
import com.wojtek.todos.dto.TodosDTO;
import com.wojtek.todos.mapper.TodosMapper;
import com.wojtek.todos.service.TodosServiceImpl;

import jakarta.validation.Valid;

@RestController
@Validated
@RequestMapping("/todos")
public class TodosController {
    TodosServiceImpl todosService;
    TodosMapper todosMapper;

    public TodosController(TodosServiceImpl todosService, TodosMapper todosMapper) {
        this.todosService = todosService;
        this.todosMapper = todosMapper;
    }

    @GetMapping
    public ResponseEntity<TodosDTO> getTodos() {
        var todos = todosService.getAllTodos();

        return ResponseEntity.ok(todos);
    }

    @PostMapping
    public ResponseEntity<TodoDTO> addTodo(@RequestBody @Valid NewTodoDTO newTodoDTO) {
        var createdTodo = todosService.addTodo(newTodoDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdTodo);
    }
}
