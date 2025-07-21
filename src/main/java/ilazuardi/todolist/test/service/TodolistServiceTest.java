package ilazuardi.todolist.test.service;

import ilazuardi.todolist.entity.Todolist;
import ilazuardi.todolist.repository.TodolistRepository;
import ilazuardi.todolist.repository.TodolistRepositoryImpl;
import ilazuardi.todolist.service.TodolistService;
import ilazuardi.todolist.service.TodolistServiceImpl;

public class TodolistServiceTest {

    public static void main(String[] args) {
        testAddTodoList();
    }

    public static void testShowTodoList() {
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        todolistRepository.data[0] = new Todolist("Belajar Java Dasar");
        todolistRepository.data[1] = new Todolist("Belajar Java OOP");
        todolistRepository.data[2] = new Todolist("Belajar Java Advance");
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.showTodolist();
    }

    public static void testAddTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Advance");

        todolistService.showTodolist();
    }
}
