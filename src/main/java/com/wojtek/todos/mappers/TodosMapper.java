package com.wojtek.todos.mappers;

import com.wojtek.todos.dtos.TodoDTO;
import com.wojtek.todos.dtos.TodosDTO;
import com.wojtek.todos.entities.Todo;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.StreamSupport;

@Mapper(componentModel = "spring")
public interface TodosMapper {

    TodoDTO mapToDto(Todo source);

    default TodosDTO mapToDto(List<Todo> entities) {
        var todos = StreamSupport.stream(entities.spliterator(), false)
                .map(this::mapToDto)
                .toList();
        return new TodosDTO(todos);
    }
}
