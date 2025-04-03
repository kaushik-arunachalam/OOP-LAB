interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class PayPal implements Payment {
    public void pay() {
        System.out.println("Payment done using PayPal");
    }
}

public class Abstraction4 {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        payment1.pay();

        Payment payment2 = new PayPal();
        payment2.pay();
    }
}
