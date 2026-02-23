import java.util.Scanner;

class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Final Bill Amount: " + finalAmount);
    }

    void generateBill(int itemTotal, double discountPercentage) {
        double finalAmount = itemTotal - (itemTotal * discountPercentage / 100);
        System.out.println("Final Bill Amount: " + finalAmount);
    }
}

public class Practical06BillGeneratorOverloading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BillGenerator bg = new BillGenerator();

        System.out.print("Enter item total: ");
        int total = sc.nextInt();

        System.out.println("\nCustomer Type:");
        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                bg.generateBill(total);
                break;

            case 2:
                System.out.print("Enter flat discount amount: ");
                int discount = sc.nextInt();
                bg.generateBill(total, discount);
                break;

            case 3:
                System.out.print("Enter discount percentage: ");
                double percent = sc.nextDouble();
                bg.generateBill(total, percent);
                break;

            default:
                System.out.println("Invalid customer type selected.");
        }
    }
}