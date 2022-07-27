package com.spring.boot.springbootdatarest.service;

import com.spring.boot.springbootdatarest.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class ServiceTodoImpl implements ServiceTodo{
    private final String URL = "http://localhost:8080/todos";

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<Todo> findAllTodo() {
        ResponseEntity<List<Todo>> responseEntity = restTemplate
                .exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Todo>>() {
        });
        return responseEntity.getBody();
    }

    @Override
    public Todo findById(Integer id) {
        return restTemplate.getForObject(URL + "/" + id, Todo.class);
    }

    @Override
    public void saveTodo(Todo todo) {
        if (todo.getId() == null){
            restTemplate.postForEntity(URL + "/", todo, String.class);
        } else {
            restTemplate.put(URL + "/", todo);
        }
    }

    @Override
    public void deleteById(Integer id) {
        restTemplate.delete(URL + "/" + id);
    }
}
