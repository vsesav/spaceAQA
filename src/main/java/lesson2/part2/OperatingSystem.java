package lesson2.part2;

public enum OperatingSystem {
    ANDROID("Android"),
    IOS("iOS"),
    WINDOWS_PHONE("Windows Phone");


    private final String name;

    OperatingSystem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
