package com.spring.boot.springbootdatarest.controller;

import com.spring.boot.springbootdatarest.entity.Todo;
import com.spring.boot.springbootdatarest.service.ServiceTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private ServiceTodo serviceTodo;

    @RequestMapping("/")
    public String showAllTodo(Model model){
        List<Todo> allTodo = serviceTodo.findAllTodo();
        model.addAttribute("allToDs", allTodo);
        return "all-todos";
    }

    @RequestMapping("/addNewTodo")
    public String addNew(Model model){
        model.addAttribute("addedTodo", new Todo());
        return "added-todo-info";
    }

    @RequestMapping("/saveAddedToDo")
    public String saveTodo(@ModelAttribute ("addedTodo") Todo todo){
        serviceTodo.saveTodo(todo);
        return "redirect:/";
    }
    @RequestMapping("/updateInfo")
    public String update(@RequestParam("todoId") Integer id, Model model){
        Todo todobyId = serviceTodo.findById(id);
        model.addAttribute("addedTodo",todobyId);
        return "added-todo-info";
    }
    @RequestMapping("/deleteTodo")
    public String delete(@RequestParam("todoId") Integer id){
        serviceTodo.deleteById(id);
        return "redirect:/";
    }
}
