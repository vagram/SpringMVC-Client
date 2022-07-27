package com.spring.boot.springbootdatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Todo {
    private Integer id;
    private String title;
    private String descriptionTodo;
    private String priority;
    private String dateTodo;
    private Integer isDeleted;

}
