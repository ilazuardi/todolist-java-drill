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
    public void remove(Integer number) {

    }
}
