package ilazuardi.todolist.repository;

import ilazuardi.todolist.entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository {

    public Todolist[] data = new Todolist[1];

    @Override
    public Todolist[] getAll() {
        return data;
    }

    @Override
    public void add(Todolist todolist) {
        var isAddProcessing = true;
        var i=0;
        while (isAddProcessing) {
            if (data[i]==null) {
                data[i]=todolist;

                isAddProcessing = false;
            } else if (i == data.length-1){
                var tempModel = data;
                data = new Todolist[tempModel.length + 1];

                for (var j=0; j<tempModel.length;j++) {
                    data[j] = tempModel[j];
                }
            }
            i++;
        }
    }

    @Override
    public void remove(int number) {
        if (number > data.length) {
            System.out.println("Number of Todo not found");
        } else if (data[number - 1] == null) {
            System.out.println("Number of Todo not found");
        } else {
            data[number-1] = null;
            for (var i=number-1; i<data.length-1; i++) {
                data[i] = data[i+1];
            }
            data[data.length-1] = null;
        }
    }
}
