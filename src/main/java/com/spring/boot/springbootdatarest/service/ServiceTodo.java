package com.spring.boot.springbootdatarest.service;

import com.spring.boot.springbootdatarest.entity.Todo;

import java.util.List;

public interface ServiceTodo {
    List<Todo> findAllTodo();
    Todo findById(Integer id);
    void saveTodo(Todo todo);
    void deleteById(Integer id);
}
