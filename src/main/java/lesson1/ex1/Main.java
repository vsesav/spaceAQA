package lesson1.ex1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InformationAboutYourself mySelf = new InformationAboutYourself("Vsevolod", "Savko",
                                                LocalDate.of(1995, 12, 1));

        System.out.println(mySelf.toString());
    }
}
