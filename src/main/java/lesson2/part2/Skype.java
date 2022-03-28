package lesson2.part2;

public class Skype implements Call{
    String nickname;
    int balance;

    public Skype(String nickname, int balance) {
        this.nickname = nickname;
        this.balance = balance;
    }

    @Override
    public void dialNumber(long number) {
        if (balance > 0) {
            System.out.println("Вы набрали номер: " + number);
        } else {
            System.out.println("Пополните баланс!");
        }
    }

    public void dialUser(String user) {
        System.out.println("Вы набрали пользователя: " + user);
    }

    @Override
    public void answerTheCall() {
        System.out.println("Вы ответили на звонок");
    }

    @Override
    public void declineTheCall() {
        System.out.println("Вы отклонили звонок");
    }

    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Nickname: " + nickname + '\n' +
                "Balance: " + balance;
    }
}
