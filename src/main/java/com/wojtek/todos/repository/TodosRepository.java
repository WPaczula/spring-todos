package com.wojtek.todos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.wojtek.todos.entities.Todo;

public interface TodosRepository extends CrudRepository<Todo, String> {

}
