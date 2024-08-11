import java.util.Scanner;

class SavingsAccount {
    private double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double a) {
        savingsBalance = a;
    }

    public void modifyInterestRate(double a) {
        annualInterestRate = a;
    }

    public void setbal(double a) {
        savingsBalance = a;
    }

    public double getrate() {
        return annualInterestRate;
    }

    public double getbal() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        System.out.println("Monthly Interest is : " +  monthlyInterest);
        savingsBalance += monthlyInterest;
    }
}

public class expt41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the initial balances
        System.out.print("Enter initial balance for Saver 1: ");
        double balance1 = scanner.nextDouble();
        System.out.print("Enter initial balance for Saver 2: ");
        double balance2 = scanner.nextDouble();

        // Create SavingsAccount instances with user-provided balances
        SavingsAccount s1 = new SavingsAccount(balance1);
        SavingsAccount s2 = new SavingsAccount(balance2);

        // Get user input for the interest rate
        System.out.print("Enter annual interest rate (e.g., 0.04 for 4%): ");
        double interestRate = scanner.nextDouble();

        s1.modifyInterestRate(interestRate);
        s2.modifyInterestRate(interestRate);

        // Calculate and display interest
        s1.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();

        System.out.println("Balance of Saver 1 at " + (interestRate * 100) + "% Annual Interest Rate  : " + s1.getbal());
        System.out.println("Balance of Saver 2 at " + (interestRate * 100) + "% Annual Interest Rate  : " + s2.getbal());

        // Get user input for a new interest rate
        System.out.print("Enter new annual interest rate (e.g., 0.05 for 5%): ");
        double newInterestRate = scanner.nextDouble();

        s1.modifyInterestRate(newInterestRate);
        s2.modifyInterestRate(newInterestRate);

        // Calculate and display interest with new interest rate
        s1.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();

        System.out.println("Balance of Saver 1 at " + (newInterestRate * 100) + "% Annual Interest Rate  : " + s1.getbal());
        System.out.println("Balance of Saver 2 at " + (newInterestRate * 100) + "% Annual Interest Rate  : " + s2.getbal());

        scanner.close();
    }
}
