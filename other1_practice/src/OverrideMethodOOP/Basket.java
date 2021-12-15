package OverrideMethodOOP;

public class Basket {

    // пример перегружаемых методов
    public static void main(String[] args) {
        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();

        System.out.println("b1: ");
        b1.pay(1200.0);
        System.out.println("b2: ");
        b2.pay("1234567889");
        System.out.println("b3: ");
        b3.pay("321425", "5555");
    }
    void pay(double money) {
        System.out.println("Payed cash " + money);
    }

    void pay (String cardNumber) {
        System.out.println("Payed credit card #" + cardNumber);
    }

    void pay (String accountNumber, String bankCode) {
        System.out.println("Sent on #" + accountNumber + " in bank " + bankCode);
    }
}
