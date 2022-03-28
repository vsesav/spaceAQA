package lesson1.ex4;

import java.time.LocalDate;
import java.time.Period;

public class Salary {
    private final LocalDate dateOfEmployment;
    private float salary;
    private static final int INCREMENT_OF_SALARY = 100;

    public Salary(float salary, LocalDate dateOfEmployment) {
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

    public void monthlySalaryIncreaseByWhile() {
        int monthOfWork = 1;
        while (monthOfWork <= getNumberOfMonths(dateOfEmployment)) {
            System.out.println("Зарплата за " + monthOfWork + " месяц: " + salary);
            salary += INCREMENT_OF_SALARY;
            monthOfWork++;
        }
    }

    public void monthlySalaryIncreaseByDoWhile() {
        int monthOfWork = 1;
        do{
            System.out.println("Зарплата за " + monthOfWork + " месяц: " + salary);
            salary += INCREMENT_OF_SALARY;
            monthOfWork++;
        }
        while(monthOfWork <= getNumberOfMonths(dateOfEmployment));

    }

    public void monthlySalaryIncreaseByFor() {
        for (int i = 1; i <= getNumberOfMonths(dateOfEmployment); i++) {
            System.out.println("Зарплата за " + i + " месяц: " + salary);
            salary += INCREMENT_OF_SALARY;
        }
    }

    public int getNumberOfMonths(LocalDate startDate) {
        Period period = Period.between(startDate, LocalDate.now());
        return period.getYears() * 12 + period.getMonths();
    }
}
