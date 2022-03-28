package lesson1.ex3;

public class Main {
    public static void main(String[] args) {
        String name = "Vsevolod";
        System.out.println("Contains 'a': " + name.contains("a") + "\n" +
                "Equals 'Vsevolod': " + name.equals("Vsevolod") + "\n" +
                "Length of the name: " + name.length() + "\n" +
                "In lower case: " + name.toLowerCase() + "\n" +
                "In upper case: " + name.toUpperCase() + "\n" +
                "Concatenate surname: " + name.concat(" Savko")
        );

    }
}
