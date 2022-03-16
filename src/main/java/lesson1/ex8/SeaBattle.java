package lesson1.ex8;

import java.util.Random;

public class SeaBattle {
    private final String[][] ground = new String[10][10];
    private static final String EMPTY_CELL = " • ";
    private static final String ONE_DECK_OF_THE_SHIP = " ■ ";
    private final Random random = new Random();

    public SeaBattle() {
        initialization(ground);

        randomShipCreating(4);

        randomShipCreating(3);
        randomShipCreating(3);

        randomShipCreating(2);
        randomShipCreating(2);
        randomShipCreating(2);

        randomShipCreating(1);
        randomShipCreating(1);
        randomShipCreating(1);
        randomShipCreating(1);

    }

    // Создание поля морского боя
    private void initialization(String[][] array) {
        for (int y = 0; y < array.length; y++) {

            for (int x = 0; x < array.length; x++) {

                array[y][x] = EMPTY_CELL;

            }
        }
    }

    //  Вывод поля морского боя
    public void printGround() {
        for (String[] strings : ground) {

            for (int i = 0; i < ground.length; i++) {

                System.out.print(strings[i]);
            }

            System.out.println();
        }
    }

    // Рандомное добавление горизонтально расположенного коробля заданного размера
    private void horizontal(int shipSize) {
        int x = random.nextInt(11 - shipSize);
        int y = random.nextInt(11 - shipSize);

        while (!horizontalVerification(x, y, shipSize)) {
            x = random.nextInt(11 - shipSize);
            y = random.nextInt(11 - shipSize);
        }
        for (int shipX = x; shipX < x + shipSize; shipX++) {
            ground[y][shipX] = ONE_DECK_OF_THE_SHIP;
        }
    }


    // Рандомное добавление вертикально расположенного коробля заданного размера
    private void vertical(int shipSize) {
        int x = random.nextInt(11 - shipSize);
        int y = random.nextInt(11 - shipSize);

        while (!verticalVerification(x, y, shipSize)) {
            x = random.nextInt(11 - shipSize);
            y = random.nextInt(11 - shipSize);
        }
        for (int shipY = y; shipY < y + shipSize; shipY++) {
            ground[shipY][x] = ONE_DECK_OF_THE_SHIP;
        }

    }


    // Проверка возможности размещения вертикального корабля с заданными координатами и размером
    private boolean verticalVerification(int x, int y, int shipSize) {
        for (int shipY = y - 1; shipY < y + shipSize + 1; shipY++) {
            if (shipY < 0) {
                continue;
            }
            if (shipY > 9) {
                break;
            }

            if ((x != 0 && checkContainShipDeck(shipY, x - 1))
                    || checkContainShipDeck(shipY, x)
                    || ((x < 9) && checkContainShipDeck(shipY, x + 1))) {
                return false;
            }
        }
        return true;
    }


    // Проверка возможности размещения горизонтального корабля с заданными координатами и размером
    private boolean horizontalVerification(int x, int y, int shipSize) {
        for (int shipX = x - 1; shipX < x + shipSize + 1; shipX++) {

            if (shipX < 0) {
                continue;
            }
            if (shipX > 9) {
                break;
            }

            if ((y != 0 && checkContainShipDeck(y - 1, shipX))
                    || checkContainShipDeck(y, shipX)
                    || ((y < 9) && checkContainShipDeck(y + 1, shipX))) {
                return false;
            }
        }
        return true;
    }

    // Создает корабль рандомного направления заданного размера
    private void randomShipCreating(int shipSize) {

        if (random.nextBoolean()) {
            vertical(shipSize);
        } else {
            horizontal(shipSize);
        }
    }

    //Проверка наличия палубы коробля в заданной координате
    private boolean checkContainShipDeck(int y, int x) {

        return ground[y][x].equals(ONE_DECK_OF_THE_SHIP);

    }

}