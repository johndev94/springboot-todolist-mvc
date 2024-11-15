package com.johnproj.todolist.repo;

import com.johnproj.todolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository <TodoItem, Long>{
}
