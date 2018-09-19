package com.tw.train.restfulapi.Service;

import com.tw.train.restfulapi.modal.Todo;
import com.tw.train.restfulapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    private List<Todo> todoList = new ArrayList<>();

    public List<Todo> getTodoList() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(Long id) {
        return todoRepository.getOne(id);
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> deleteTodo(Long id) {
        todoRepository.delete(id);
        return todoRepository.findAll();
    }

    public Todo UpdateTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Page<Todo> getPageSize(Integer page, Integer size) {
        Pageable pageable = new PageRequest(page - 1, size);
        return todoRepository.findAll(pageable);
    }
}
