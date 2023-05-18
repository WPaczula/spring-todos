package com.wojtek.todos.dtos;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class NewTodoDTO {
    @NotBlank
    @Length(min = 3)
    private String title;

    @NotNull
    private Boolean done;

    public NewTodoDTO() {
    }

    public NewTodoDTO(String title, Boolean done) {
        this.title = title;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
