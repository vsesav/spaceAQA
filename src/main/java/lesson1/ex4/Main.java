package lesson1.ex4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Salary worker1 = new Salary(3000, LocalDate.of(2020, 11, 5));
        worker1.monthlySalaryIncreaseByFor();
        System.out.println();

        Salary worker2 = new Salary(3000, LocalDate.of(2020, 11, 5));
        worker2.monthlySalaryIncreaseByWhile();
        System.out.println();

        Salary worker3 = new Salary(3000, LocalDate.of(2020, 11, 5));
        worker3.monthlySalaryIncreaseByDoWhile();
        System.out.println();
    }
}
