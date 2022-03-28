package lesson1.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");
        Scanner scanner = new Scanner(System.in);

        if (scanner.nextLine().equals("Привет!")) {
            System.out.println("Как дела?");
            scanner = new Scanner(System.in);

            if (scanner.nextLine().equals("Хорошо!")){
                System.out.println("Отлично!");
            } else if (scanner.nextLine().equals("Плохо!")){
                System.out.println("Не кисни!");
            } else if (scanner.nextLine().equals("Не твое дело!")){
                System.out.println("Пока!");
            } else {
                System.out.println("Пока!");
            }
        } else {
            System.out.println("Пока!");
        }
    }
}
