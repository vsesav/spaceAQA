package lesson2.part2;

public class Smartphone extends MobilePhone{
    public final int numberOfMemoryCards;
    private final boolean[] memoryCardsIn;
    private final int[] memoryCards;
    private final OperatingSystem os;


    public Smartphone(Brand brand, int memory, boolean memoryCard, int numberOfMemoryCards, OperatingSystem os) {
        super(brand, memory, memoryCard);
        this.os = os;

        if (super.memoryCard) {
            this.numberOfMemoryCards = numberOfMemoryCards;
            memoryCardsIn = new boolean[numberOfMemoryCards];
            memoryCards = new int[numberOfMemoryCards];
        } else {
            this.numberOfMemoryCards = 0;
            memoryCardsIn = null;
            memoryCards = null;
        }
    }


    public void addMemoryCard(int memoryOfTheMemoryCard, int slot) {
        try {
            if (!super.memoryCard) {
                System.out.println("Нет слота под карту памяти!");
            } else if (!memoryCardsIn[slot - 1]) {
                super.memory += memoryOfTheMemoryCard;
                memoryCardsIn[slot - 1] = true;
                memoryCards[slot - 1] = memoryOfTheMemoryCard;
            } else {
                System.out.println("Карта памяти уже вставлена!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! Нет слота с таким номером!");
        } catch (NullPointerException e) {
            System.out.println("Error! Массив слотов не проинициализирован!");
        }
    }


    public void removeMemoryCard(int slot) {
        try {
            if (memoryCardsIn[slot - 1]) {
                memory -= memoryCards[slot -1 ];
                memoryCards[slot - 1] = 0;
                memoryCardsIn[slot - 1] = false;
            } else {
                System.out.println("Нечего извлекать!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! Нет слота с таким номером!");
        } catch (NullPointerException e) {
            System.out.println("Error! Массив слотов не проинициализирован!");
        }
    }

    public void openMarket(){
        switch (os){
            case IOS:
                System.out.println("Открыт App Store");
                break;
            case ANDROID:
                System.out.println("Открыт Google Play");
                break;
            case WINDOWS_PHONE:
                System.out.println("Открыт Windows Phone Store");
                break;
        }
    }
}
