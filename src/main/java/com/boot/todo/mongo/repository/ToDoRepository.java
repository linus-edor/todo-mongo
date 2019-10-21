package com.boot.todo.mongo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.todo.mongo.model.ToDo;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, String> {
}