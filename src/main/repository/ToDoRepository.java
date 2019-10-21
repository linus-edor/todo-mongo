package com.boot.todo.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.todo.jpa.model.ToDo;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, String> {
}