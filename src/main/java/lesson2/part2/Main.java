package lesson2.part2;

public class Main {

    public static void main(String[] args) {
        //Phone
        Phone apple = new Phone(Brand.APPLE);
        apple.dialNumber(79999999999L);
        apple.answerTheCall();
        apple.declineTheCall();
        System.out.println(apple.toString());
        System.out.println();


        //MobilePhone
        MobilePhone xiaomi = new MobilePhone(Brand.XIAOMI, 64, false);
        xiaomi.addNumberToThePhoneBook("Seva", 79999999999L);
        xiaomi.getNumberFromThePhoneBook("Seva");

        xiaomi.addMemoryCard(64);
        xiaomi.removeMemoryCard();

        System.out.println(xiaomi.toString());
        System.out.println();

        //Smartphone
        Smartphone smart = new Smartphone(Brand.XIAOMI, 64, true, 3,
                OperatingSystem.IOS);

        System.out.println(smart.memory);

        smart.addMemoryCard(128, 1);
        System.out.println(smart.memory);


        smart.addMemoryCard(128, 2);
        System.out.println(smart.memory);


        smart.addMemoryCard(128, 2);
        System.out.println(smart.memory);


        smart.removeMemoryCard(2);
        System.out.println(smart.memory);

        smart.openMarket();

        System.out.println(smart.toString());
        System.out.println();


        //Skype
        Skype skype = new Skype("vs", 0);
        skype.dialNumber(79999999999L);
        skype.deposit(100);
        skype.dialNumber(79999999999L);
        skype.answerTheCall();
        skype.declineTheCall();
        System.out.println(skype.toString());
    }

}

