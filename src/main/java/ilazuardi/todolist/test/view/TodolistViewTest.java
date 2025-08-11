package ilazuardi.todolist.test.view;

import ilazuardi.todolist.repository.TodolistRepository;
import ilazuardi.todolist.repository.TodolistRepositoryImpl;
import ilazuardi.todolist.service.TodolistService;
import ilazuardi.todolist.service.TodolistServiceImpl;
import ilazuardi.todolist.view.TodolistView;

public class TodolistViewTest {

    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Advance");

        todolistView.showTodolist();
    }

    public static void testAddTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Advance");

        todolistView.addTodolist();
        todolistView.showTodolist();
    }

    public static void testRemoveTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Advance");

        todolistView.removeTodolist();
        todolistView.showTodolist();
    }
}
