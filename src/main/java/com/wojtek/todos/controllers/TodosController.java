package com.wojtek.todos.controllers;

import com.wojtek.todos.dtos.TodosDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wojtek.todos.mappers.TodosMapper;
import com.wojtek.todos.services.TodosServiceImpl;

@RestController()
@RequestMapping("/todos")
public class TodosController {
    TodosServiceImpl todosService;
    TodosMapper todosMapper;

    public TodosController(TodosServiceImpl todosService, TodosMapper todosMapper) {
        this.todosService = todosService;
        this.todosMapper = todosMapper;
    }

    @GetMapping()
    public ResponseEntity<TodosDTO> getTodos() {
        var todos = todosService.getAllTodos();
        var todosDTO = todosMapper.mapToDto(todos);

        return ResponseEntity.ok(todosDTO);
    }
}
