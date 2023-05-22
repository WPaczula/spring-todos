package com.wojtek.todos.mapper;

import com.wojtek.todos.dto.NewTodoDTO;
import com.wojtek.todos.dto.TodoDTO;
import com.wojtek.todos.dto.TodosDTO;
import com.wojtek.todos.entity.Todo;

import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.StreamSupport;

@Mapper(componentModel = "spring")
public interface TodosMapper {

    TodoDTO mapToDTO(Todo source);

    Todo mapToEntity(NewTodoDTO source);

    default TodosDTO mapToDTO(List<Todo> entities) {
        var todos = StreamSupport.stream(entities.spliterator(), false)
                .map(this::mapToDTO)
                .toList();
        return new TodosDTO(todos);
    }
}
