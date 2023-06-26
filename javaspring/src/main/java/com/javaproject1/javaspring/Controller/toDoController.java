package com.javaproject1.javaspring.Controller;
package com.todolist.controller;

package com.todolist.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lebo.todolist.model.TodoItem;
import com.lebo.todolist.repo.TodoRepo;

public class toDoController {
    @RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TodoItem> findOne(Long id) {
        return todoRepo.findById(id);
    }

    @PostMapping
    public TodoItem save(@Validated @NonNull @RequestBody TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@Validated @NonNull @RequestBody TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        todoRepo.deleteById(id);
    }
    
}
}

@Entity
public class TodoItem {

    private Long id;
    @NonNull
    private String title;
    private boolean done;

    public TodoItem() {
    }

    public TodoItem(Long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
