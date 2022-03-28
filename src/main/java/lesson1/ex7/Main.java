package lesson1.ex7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] channels = {"СТС", "Первый", "Россия", "НТВ", "ТНТ", "РТВ"};

        System.out.println("Введите число номер канала:");
        boolean tryAgain = true;
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println(channels[scanner.nextInt()]);
                tryAgain = false;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите число!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Нет канала с таким номером!");
            }
        } while (tryAgain);

    }
}
