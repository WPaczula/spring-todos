package com.wojtek.todos.controllers;

import com.wojtek.todos.dtos.NewTodoDTO;
import com.wojtek.todos.dtos.TodoDTO;
import com.wojtek.todos.dtos.TodosDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wojtek.todos.mappers.TodosMapper;
import com.wojtek.todos.services.TodosServiceImpl;

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
        var todosDTO = todosMapper.mapToDto(todos);

        return ResponseEntity.ok(todosDTO);
    }

    @PostMapping
    public ResponseEntity<TodoDTO> addTodo(@RequestBody @Valid NewTodoDTO newTodoDTO) {
        var newTodo = todosMapper.map(newTodoDTO);
        var createdTodo = todosService.addTodo(newTodo);
        var todoDTO = todosMapper.map(createdTodo);

        return ResponseEntity.ok(todoDTO);
    }
}
