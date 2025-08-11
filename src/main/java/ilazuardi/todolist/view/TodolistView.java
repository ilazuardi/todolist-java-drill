package ilazuardi.todolist.view;

import ilazuardi.todolist.service.TodolistService;
import ilazuardi.todolist.util.InputUtil;

public class TodolistView {

    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodolist() {
        while(true) {
            todolistService.showTodolist();

            System.out.println("MENU :\n1. Tambah\n2. Hapus\nX. Keluar");
            var inputMenu = InputUtil.input("Input Menu");
            if (inputMenu.equals("1")) {
                addTodolist();
            } else if (inputMenu.equals("2")) {
                removeTodolist();
            } else if (inputMenu.equalsIgnoreCase("x")) {
                break;
            } else System.out.println("Error");
            System.out.println("=================================\n");
        }
    }

    public void addTodolist() {
        var inputTodo = InputUtil.input("Mau Ngerjain apa nih ?");
        if (!inputTodo.equalsIgnoreCase("x"))
            todolistService.addTodolist(inputTodo);
    }

    public void removeTodolist() {
        var inputNumberTodo = InputUtil.input("Mau hapus todo ke berapa ?");
        if (!inputNumberTodo.equalsIgnoreCase("x"))
            todolistService.removeTodolist(Integer.valueOf(inputNumberTodo));
    }
}