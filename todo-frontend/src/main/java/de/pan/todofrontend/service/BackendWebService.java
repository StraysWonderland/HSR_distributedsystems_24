package de.pan.todofrontend.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.pan.todofrontend.model.TodoItem;

@FeignClient(value = "BackendWebService", url = "http://todo-backend:8080/")
public interface BackendWebService {

    @RequestMapping(method = RequestMethod.GET, value = "/todo")
    List<TodoItem> getTodoItems();

    @RequestMapping(method = RequestMethod.POST, value = "/todo")
    TodoItem createTodoItem(@RequestBody TodoItem todoItem);
}
