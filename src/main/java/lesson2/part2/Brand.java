package lesson2.part2;

public enum Brand {
    APPLE("Apple"),
    MOTOROLA("Motorola"),
    NOKIA("Nokia"),
    SAMSUNG("Samsung"),
    SIEMENS("Siemens"),
    SONY("Sony"),
    XIAOMI("Xiaomi");

    private final String name;

    Brand(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
