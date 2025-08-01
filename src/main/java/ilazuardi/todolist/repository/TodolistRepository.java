package ilazuardi.todolist.repository;

import ilazuardi.todolist.entity.Todolist;

public interface TodolistRepository {

    Todolist[] getAll();

    void add(Todolist todolist);

    void remove(int number);

}
