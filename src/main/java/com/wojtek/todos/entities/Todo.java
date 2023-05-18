package com.wojtek.todos.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todo {
    @Id
    @Generated("uuid")
    private String id;

    private String title;

    private Boolean done;

    public Todo() {
    }

    public Todo(String title, Boolean done) {
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
