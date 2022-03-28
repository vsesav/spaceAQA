package lesson1.ex1;

import java.time.LocalDate;

public class InformationAboutYourself {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    InformationAboutYourself(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Date of Birth: " + dateOfBirth;
    }
}
