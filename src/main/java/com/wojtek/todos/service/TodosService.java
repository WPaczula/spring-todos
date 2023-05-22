package com.wojtek.todos.service;

import com.wojtek.todos.dto.NewTodoDTO;
import com.wojtek.todos.dto.TodoDTO;
import com.wojtek.todos.dto.TodosDTO;

public interface TodosService {
    public TodosDTO getAllTodos();

    public TodoDTO addTodo(NewTodoDTO todo);
}
