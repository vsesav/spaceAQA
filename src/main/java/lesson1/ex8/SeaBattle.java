package lesson1.ex8;

import java.util.Random;

public class SeaBattle {
    private final String[][] ground = new String[10][10];
    private static final String EMPTY_CELL = "•";
    private static final String ONE_DECK_OF_THE_SHIP = "■";
    private final Random random = new Random();
    int x;
    int y;

    public SeaBattle() {
        initialization(ground);

        randomShipOfAGivenSize(4);

        randomShipOfAGivenSize(3);
        randomShipOfAGivenSize(3);

        randomShipOfAGivenSize(2);
        randomShipOfAGivenSize(2);
        randomShipOfAGivenSize(2);

        randomShipOfAGivenSize(1);
        randomShipOfAGivenSize(1);
        randomShipOfAGivenSize(1);
        randomShipOfAGivenSize(1);

    }

    // Создание поля морского боя
    private void initialization(String[][] array) {
        try {
            for (int y = 0; y < array[0].length; y++) {

                for (int x = 0; x < array[0].length; x++) {

                    array[y][x] = " " + EMPTY_CELL + " ";

                }
            }
        } catch (Exception indexOutOfBounds) {
            System.out.println("Error: Array has no elements!");
            System.exit(1);
        }
    }

    //  Вывод поля морского боя
    public void printGround() {
        for (String[] strings : ground) {

            for (int i = 0; i < ground[0].length; i++) {

                System.out.print(strings[i]);
            }

            System.out.println();
        }
    }

    // Рандомное добавление коробля заданного размера
    private void randomShipOfAGivenSize(int shipSize) {
        boolean direction = random.nextBoolean();
        randomCoordinates(shipSize, direction);

        while (!verification(x, y, shipSize, direction)) {
            randomCoordinates(shipSize, direction);
        }

        if (direction) {
            for (int shipY = y; shipY < y + shipSize; shipY++) {
                ground[shipY][x] = " " + ONE_DECK_OF_THE_SHIP + " ";
            }
        } else {
            for (int shipX = x; shipX < x + shipSize; shipX++) {
                ground[y][shipX] = " " + ONE_DECK_OF_THE_SHIP + " ";
            }
        }
    }

    // Проверка возможности размещения корабля с заданными координатами и размером с учетом направления
    private boolean verification(int x, int y, int shipSize, boolean isItVertical) {
        int coordinate;
        int notBiggerThan;
        int a;
        if (isItVertical) {
            coordinate = y - 1;
            notBiggerThan = y + shipSize + 1;
            a = x;
        } else {
            coordinate = x - 1;
            notBiggerThan = x + shipSize + 1;
            a = y;
        }

        for (int ship = coordinate; ship < notBiggerThan; ship++) {
            if (ship < 0 || ship > 9) {
                continue;
            }
            for (int i = -1; i <= 1; i++) {
                if (checkContainShipDeck(ship, a + i, isItVertical)) {
                    return false;
                }
            }
        }
        return true;
    }

    //Проверка наличия палубы коробля в заданной координате
    private boolean checkContainShipDeck(int y, int x, boolean isItVertical) {
        try {
            if (isItVertical) {
                return ground[y][x].contains(ONE_DECK_OF_THE_SHIP);
            } else {
                return ground[x][y].contains(ONE_DECK_OF_THE_SHIP);
            }
        } catch (Exception indexOutOfBounds) {
            return false;
        }
    }

    //Рандомные координаты в зависимости от направления
    private void randomCoordinates(int shipSize, boolean direction) {
        if (direction) {
            this.x = random.nextInt(10);
            this.y = random.nextInt(11 - shipSize);
        } else {
            this.x = random.nextInt(11 - shipSize);
            this.y = random.nextInt(10);
        }
    }

}