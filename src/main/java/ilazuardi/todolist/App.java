package ilazuardi.todolist;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static String[] model = new String[1];

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        testAddTodoList();
        viewShowTodoList();
    }

    /** Method Business Logic */
    public static void showTodoList() {
        for(int i=0; i<model.length; i++) {
            var todo = model[i];
            var nomor = i+1;

            if (todo != null) {
                System.out.println(nomor + ". " + todo);
            }
        }
    }

    public static void addTodoList(String todo) {

        var isAddProcessing = true;
        var i=0;
        while (isAddProcessing) {
            if (model[i]==null) {
                model[i]=todo;

                isAddProcessing = false;
            } else if (i == model.length-1){
                var tempModel = model;
                model = new String[tempModel.length + 1];

                for (var j=0; j<tempModel.length;j++) {
                    model[j] = tempModel[j];
                }
            }
            i++;
        }
    }

    public static void removeTodoList(int numberTodo) {
        if (numberTodo > model.length) {
            System.out.println("Number of Todo not found");
        } else if (model[numberTodo - 1] == null) {
            System.out.println("Number of Todo not found");
        } else {
            model[numberTodo-1] = null;
            for (var i=numberTodo-1; i<model.length-1; i++) {
                model[i] = model[i+1];
            }
            model[model.length-1] = null;
        }
    }

    public static String inputData(String infoMessages) {
        System.out.print(infoMessages + " : ");
        return scanner.nextLine();
    }

    /** Method View */
    public static void viewShowTodoList() {
        while(true) {
            showTodoList();

            System.out.println("MENU :\n1. Tambah\n2. Hapus\n3. Keluar");
            var inputMenu = inputData("Input Menu");
            if (inputMenu.equals("1")) {
                viewAddTodoList();
            } else if (inputMenu.equals("2")) {
                viewRemoveTodoList();
            } else if (inputMenu.equals("3")) {
                break;
            } else System.out.println("Error");
            System.out.println("=================================\n");
        }
    }

    public static void viewAddTodoList() {
        var inputTodo = inputData("Mau Ngerjain apa nih ?");
        addTodoList(inputTodo);
    }

    public static void viewRemoveTodoList() {
        var inputNumberTodo = inputData("Mau hapus todo ke berapa ?");
        removeTodoList(Integer.valueOf(inputNumberTodo));
    }

    /** Method for Simple Testing */
    public static void testShowTodoList() {
        showTodoList();
    }

    public static void testAddTodoList() {
        for (var i=0; i<25; i++){
            addTodoList("Contoh ke - "+(i+1));
        }
    }

    public static void testRemoveTodoList() {
        testAddTodoList();
        removeTodoList(10);
        showTodoList();
    }

    public static void testInput() {
        var data = inputData("Nama");
        System.out.println("Hi " + data);
    }
}
