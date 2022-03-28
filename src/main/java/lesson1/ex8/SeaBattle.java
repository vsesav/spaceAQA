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
            for (int y = 0; y < array.length; y++) {

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

            for (String cell: strings) {

                System.out.print(cell);
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
        int startCoordinate;
        int endCoordinate;
        int staticCoordinate;
        if (isItVertical) {
            startCoordinate = y - 1;
            endCoordinate = y + shipSize + 1;
            staticCoordinate = x;
        } else {
            startCoordinate = x - 1;
            endCoordinate = x + shipSize + 1;
            staticCoordinate = y;
        }

        for (int dynamicCoordinate = startCoordinate; dynamicCoordinate < endCoordinate; dynamicCoordinate++) {

            for (int i = -1; i <= 1; i++) {
                if (isItVertical && checkContainShipDeck(dynamicCoordinate, staticCoordinate + i)) {
                    return false;
                } else if (!isItVertical && checkContainShipDeck(staticCoordinate + i, dynamicCoordinate)) {
                    return false;
                }
            }
        }
        return true;
    }

    //Проверка наличия палубы коробля в заданной координате
    private boolean checkContainShipDeck(int y, int x) {
        try {
            return ground[y][x].contains(ONE_DECK_OF_THE_SHIP);
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