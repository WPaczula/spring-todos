package com.wojtek.todos.dto;

public class TodoDTO {
    private String id;

    private String title;

    private Boolean done;

    public TodoDTO() {
    }

    public TodoDTO(String id, String title, Boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
