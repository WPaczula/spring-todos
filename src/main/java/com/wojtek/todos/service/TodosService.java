package com.wojtek.todos.service;

import java.util.List;

import com.wojtek.todos.entity.Todo;

public interface TodosService {
    public List<Todo> getAllTodos();

    public Todo addTodo(Todo todo);
}
