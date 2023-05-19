package com.wojtek.todos.repository;

import org.springframework.data.repository.CrudRepository;

import com.wojtek.todos.entity.Todo;

public interface TodosRepository extends CrudRepository<Todo, String> {

}
