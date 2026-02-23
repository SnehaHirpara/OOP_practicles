import java.util.Scanner;

class BankAccount {

    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double b) {
        accountId = id;
        accountHolderName = name;
        balance = b;
    }

    void display() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class Practical05BankAccountSearch {

    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[5];

        for (int i = 0; i < 5; i++) {
            accounts[i] = new BankAccount();
        }

        accounts[0].assignValues("101", "Ashish", 50000);
        accounts[1].assignValues("102", "Meet", 4785102.25);
        accounts[2].assignValues("103", "Taksh", 2488562);
        accounts[3].assignValues("104", "Harsh", 2544545);
        accounts[4].assignValues("105", "Ridham", 58641213);

        System.out.println("Displaying all account details:\n");

        for (int i = 0; i < 5; i++) {
            accounts[i].display();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account ID to search: ");
        String id = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (accounts[i].accountId.equals(id)) {
                System.out.println("\nAccount Found:");
                accounts[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }
}