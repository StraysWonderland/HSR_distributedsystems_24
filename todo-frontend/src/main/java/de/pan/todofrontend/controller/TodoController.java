package de.pan.todofrontend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.pan.todofrontend.model.TodoItem;
import de.pan.todofrontend.service.BackendWebService;

@RestController
public class TodoController {
    private BackendWebService backendWebService;

    public TodoController(BackendWebService backendWebService) {
        this.backendWebService = backendWebService;
    }

    @GetMapping("/")
    public List<TodoItem> getAllTodoItems() {
        return backendWebService.getTodoItems();
    }

    @GetMapping("/create")
    public TodoItem creatTodoItem() {
        return backendWebService.createTodoItem(new TodoItem("Neues Todo", "Dieses Item wurde aus dem Frontend per POST erstellt."));
    }
}
