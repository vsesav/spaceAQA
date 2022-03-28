package lesson1.ex6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер интересующего вас раздела меню: 1.Главная, 2.Профиль, 3.Настройки, 4.Информация" + "\n" +
                "Если вам не нужно меню введите: 0.");
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        try {
            do {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Вы на главной странице");
                        break;
                    case 2:
                        System.out.println("Вы в профиле пользователя");
                        break;
                    case 3:
                        System.out.println("Вы в настройках приложения");
                        break;
                    case 4:
                        System.out.println("В на странцие информации");
                        break;
                    case 0:
                        repeat = false;
                        break;
                }
            } while (repeat);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введен не номер!");
        }
    }

}
