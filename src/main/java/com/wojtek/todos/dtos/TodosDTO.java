package com.wojtek.todos.dtos;

import java.util.List;

public class TodosDTO {
    private List<TodoDTO> todos;

    public TodosDTO() {
    }

    public TodosDTO(List<TodoDTO> todos) {
        this.todos = todos;
    }

    public List<TodoDTO> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoDTO> todos) {
        this.todos = todos;
    }
}
