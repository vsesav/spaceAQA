package lesson2.part2;

public class Phone implements Call {
    private final Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void dialNumber(long number) {
        System.out.println("Вы набрали номер: " + number);
    }

    @Override
    public void answerTheCall() {
        System.out.println("Вы ответили на звонок");
    }

    @Override
    public void declineTheCall() {
        System.out.println("Вы отклонили звонок");
    }

    @Override
    public String toString() {
        return "Phone brand: " + brand.toString();
    }
}
