package com.wojtek.todos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wojtek.todos.dto.NewTodoDTO;
import com.wojtek.todos.dto.TodoDTO;
import com.wojtek.todos.dto.TodosDTO;
import com.wojtek.todos.entity.Todo;
import com.wojtek.todos.mapper.TodosMapper;
import com.wojtek.todos.repository.TodosRepository;

@Service
public class TodosServiceImpl implements TodosService {
    final private TodosRepository todosRepository;
    final private TodosMapper todosMapper;

    public TodosServiceImpl(TodosRepository todosRepository, TodosMapper todosMapper) {
        this.todosRepository = todosRepository;
        this.todosMapper = todosMapper;
    }

    public TodosDTO getAllTodos() {
        return todosMapper.mapToDTO((List<Todo>) todosRepository.findAll());
    }

    public TodoDTO addTodo(NewTodoDTO todoDTO) {
        var todo = todosMapper.mapToEntity(todoDTO);
        var createdTodo = todosRepository.save(todo);

        return todosMapper.mapToDTO(createdTodo);
    }
}
