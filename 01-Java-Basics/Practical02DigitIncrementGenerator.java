import java.util.Scanner;

public class Practical02DigitIncrementGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter five digit number: ");
        int number = sc.nextInt();

        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input. Please enter exactly five digits.");
            return;
        }

        int result = 0;
        int place = 1;

        while (number > 0) {

            int digit = number % 10;

            digit = (digit + 1) % 10;

            result = result + (digit * place);

            place = place * 10;
            number = number / 10;
        }

        System.out.println("New Number: " + result);
    }
}