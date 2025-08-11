package ilazuardi.todolist.util;

import java.util.Scanner;

public class InputUtil {

    public static Scanner scanner = new Scanner(System.in);

    public static String input(String infoMessages) {
        System.out.print(infoMessages + " : ");
        return scanner.nextLine();
    }

}
