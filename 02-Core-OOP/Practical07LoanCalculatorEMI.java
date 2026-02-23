class LoanCalculator {

    double calculateEMI(int principal, int time, float rate) {
        double monthlyInterest = rate / (12 * 100.0);
        int months = time * 12;

        return (principal * monthlyInterest * 
               Math.pow(1 + monthlyInterest, months)) /
               (Math.pow(1 + monthlyInterest, months) - 1);
    }

    double calculateEMI(double principal, int time, double rate) {
        double monthlyInterest = rate / (12 * 100.0);
        int months = time * 12;

        return (principal * monthlyInterest * 
               Math.pow(1 + monthlyInterest, months)) /
               (Math.pow(1 + monthlyInterest, months) - 1);
    }

    double calculateEMI(int principal, int time) {
        double rate = 10;  // Fixed 10% interest
        double monthlyInterest = rate / (12 * 100.0);
        int months = time * 12;

        return (principal * monthlyInterest * 
               Math.pow(1 + monthlyInterest, months)) /
               (Math.pow(1 + monthlyInterest, months) - 1);
    }
}

public class Practical07LoanCalculatorEMI {

    public static void main(String[] args) {

        LoanCalculator loan = new LoanCalculator();

        double homeLoan = loan.calculateEMI(5000000, 20, 7.2f);
        double carLoan = loan.calculateEMI(5000000.0, 5, 9.0);
        double personalLoan = loan.calculateEMI(500000, 3);

        System.out.printf("Home Loan EMI: %.2f\n", homeLoan);
        System.out.printf("Car Loan EMI: %.2f\n", carLoan);
        System.out.printf("Personal Loan EMI: %.2f\n", personalLoan);
    }
}