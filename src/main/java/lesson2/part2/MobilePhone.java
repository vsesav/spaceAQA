package lesson2.part2;

import java.util.HashMap;

public class MobilePhone extends Phone {
    protected int memory;
    protected final boolean memoryCard;
    protected boolean memoryCardIn = false;
    private int memoryOfTheMemoryCard;
    private HashMap<String, Long> phoneBook = new HashMap<>();

    public MobilePhone(Brand brand, int memory, boolean memoryCard) {
        super(brand);
        this.memory = memory;
        this.memoryCard = memoryCard;
    }

    public void addNumberToThePhoneBook(String name, long phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    public void getNumberFromThePhoneBook(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Номер телефона: " + phoneBook.get(name));
        } else {
            System.out.println("В телефонной книге нет такого пользователя, либо вы ввели его имя некорректно!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Phone memory: " + memory + "\n" +
                "Слот под карту памяти: " + (memoryCard ? "Есть" : "Нет");
    }

    public void addMemoryCard(int memoryOfTheMemoryCard) {
        if (!memoryCard) {
            System.out.println("Нет слота под карту памяти!");
        } else if (!memoryCardIn) {
            memory += memoryOfTheMemoryCard;
            this.memoryOfTheMemoryCard = memoryOfTheMemoryCard;
            memoryCardIn = true;
        } else {
            System.out.println("Карта памяти уже вставлена!");
        }
    }

    public void removeMemoryCard() {
        if (memoryCardIn) {
            memory -= memoryOfTheMemoryCard;
            memoryOfTheMemoryCard = 0;
            memoryCardIn = false;
        } else {
            System.out.println("Нечего извлекать!");
        }
    }

}
