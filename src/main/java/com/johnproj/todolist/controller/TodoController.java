package com.johnproj.todolist.controller;

import com.johnproj.todolist.model.TodoItem;
import com.johnproj.todolist.repo.TodoRepo;
import jakarta.validation.Valid;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@Valid @org.jetbrains.annotations.NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@Valid @org.jetbrains.annotations.NotNull @RequestBody TodoItem todoItem)
    {
        return todoRepo.save(todoItem);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
