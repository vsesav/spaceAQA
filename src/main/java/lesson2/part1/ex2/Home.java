package lesson2.part1.ex2;

public class Home implements Housework{
    private final byte numberOfRooms;
    private byte cleanRooms;
    private byte dirtyRooms;

    public Home(byte numberOfRooms, byte cleanRooms) {
            this.numberOfRooms = numberOfRooms;
        if (cleanRooms <= numberOfRooms) {
            this.cleanRooms = cleanRooms;
            this.dirtyRooms = (byte) (numberOfRooms - cleanRooms);
        } else {
            System.out.println("Error: кол-во чистых комнат не может быть больше общего кол-ва комнат!");
            System.exit(1);
        }

        if (this.numberOfRooms * this.dirtyRooms * this.cleanRooms < 0) {
            System.out.println("Error: поля класса не могут быть отрицательными!");
            System.exit(1);
        }
    }

    @Override
    public void cleanTheRoom(byte number) {
        if (number <= dirtyRooms) {
            dirtyRooms -= number;
            cleanRooms = (byte) (numberOfRooms - dirtyRooms);
            System.out.println("Убрано " + cleanRooms + " из " + numberOfRooms);
        } else {
            System.out.println("Кол-во грязных комнат меньше, чем вы хотите убрать!");
        }
    }

    @Override
    public void washTheDishes() {
        System.out.println("Вы помыли посуду!");
    }
}
