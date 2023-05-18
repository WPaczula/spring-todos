package com.wojtek.todos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wojtek.todos.entities.Todo;
import com.wojtek.todos.repositories.TodosRepository;

@Service
public class TodosServiceImpl implements TodosService {
    final private TodosRepository todosRepository;

    public TodosServiceImpl(TodosRepository todosRepository) {
        this.todosRepository = todosRepository;
    }

    public List<Todo> getAllTodos() {
        return (List<Todo>) todosRepository.findAll();
    }

    @Override
    public Todo addTodo(Todo todo) {
        var createdTodo = todosRepository.save(todo);

        return createdTodo;
    }
}
