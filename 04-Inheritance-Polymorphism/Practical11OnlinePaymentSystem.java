import java.util.Scanner;

class Payment {

    void processPayment(int amount) {
        System.out.println("Processing payment of Rs." + amount);
    }
}

class CreditCardPayment extends Payment {

    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using Credit Card");
    }
}

class UPIPayment extends Payment {

    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using UPI");
    }
}

public class Practical11OnlinePaymentSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Payment p = null;

        switch (choice) {

            case 1:
                p = new CreditCardPayment();
                break;

            case 2:
                p = new UPIPayment();
                break;

            default:
                System.out.println("Invalid choice.");
        }

        if (p != null) {
            p.processPayment(amount);
        }
    }
}