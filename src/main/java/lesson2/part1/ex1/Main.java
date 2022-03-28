package lesson2.part1.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");
        try {
            multiplication(scanner.nextFloat(), scanner.nextFloat());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Вы ввели не число!");
        }
    }

    private static void multiplication(float a, float b) {
        System.out.println(a * b);
    }
}
