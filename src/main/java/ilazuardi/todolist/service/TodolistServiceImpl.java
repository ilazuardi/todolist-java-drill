package ilazuardi.todolist.service;

import ilazuardi.todolist.entity.Todolist;
import ilazuardi.todolist.repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {

    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodolist() {

        Todolist[] model = todolistRepository.getAll();

        System.out.println("TODO LIST");
        for(int i=0; i<model.length; i++) {
            var todo = model[i];
            var nomor = i+1;

            if (todo != null) {
                System.out.println(nomor + ". " + todo.getTodo());
            }
        }
    }

    @Override
    public void addTodolist(String todo) {
        Todolist newTodo = new Todolist(todo);
        todolistRepository.add(newTodo);
        System.out.println("SUKSES MENAMBAH DATA");
    }

    @Override
    public void removeTodolist(Integer number) {
        todolistRepository.remove(number);
        System.out.println("DATA BERHASIL DIHAPUS");
    }
}
