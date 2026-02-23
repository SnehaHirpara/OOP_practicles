public class Practical03CommandLineCalculator {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[1]);

        double sum = firstNumber + secondNumber;

        System.out.println("Sum: " + sum);
    }
}