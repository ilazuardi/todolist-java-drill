package ilazuardi.todolist;

import ilazuardi.todolist.repository.TodolistRepositoryImpl;
import ilazuardi.todolist.service.TodolistService;
import ilazuardi.todolist.service.TodolistServiceImpl;
import ilazuardi.todolist.view.TodolistView;

public class AppV2 {

    public static void main(String[] args) {
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.showTodolist();
    }

}
