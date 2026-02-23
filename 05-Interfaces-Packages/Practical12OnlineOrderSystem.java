import java.util.Scanner;

interface Order {

    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {

    protected String item;
    protected int qty;
    protected int orderId;
    protected boolean isCancelled = false;

    public void placeOrder(String item, int qty) {

        this.item = item;
        this.qty = qty;
        orderId = (int)(Math.random() * 1000);

        System.out.println("Order Placed Successfully!");
        System.out.println("Item Name : " + item);
        System.out.println("Quantity  : " + qty);
        System.out.println("Order ID  : " + orderId);
    }
}

class FinalOrder extends PartialOrder {

    public void cancelOrder(int id) {

        if (this.orderId == id && !isCancelled) {
            isCancelled = true;
            System.out.println("Order with ID " + id + " has been cancelled.");
        } else {
            System.out.println("Invalid Order ID.");
        }
    }

    public void generateBill() {

        if (isCancelled) {
            System.out.println("Order is cancelled. No bill generated.");
            return;
        }

        double price = 100;
        double total = price * qty;

        System.out.println("\n----- Final Bill -----");
        System.out.println("Item Name       : " + item);
        System.out.println("Quantity        : " + qty);
        System.out.println("Price per Item  : " + price);
        System.out.println("Total Amount    : " + total);
        System.out.println("----------------------");
    }
}

public class Practical12OnlineOrderSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        System.out.print("Enter item name: ");
        String item = sc.next();

        System.out.print("Enter item quantity: ");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        System.out.println("\n1. Cancel Order");
        System.out.println("2. Generate Bill");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Order ID to cancel: ");
                int id = sc.nextInt();
                order.cancelOrder(id);
                break;

            case 2:
                order.generateBill();
                break;

            default:
                System.out.println("Please enter valid choice.");
        }
    }
}