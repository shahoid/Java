import java.util.Scanner;

public class SavingAccount1 
{
    private double savingbalance;
    private static double annualinterestrate;

    public SavingAccount1(double balance) {
        this.savingbalance = balance;
    }

    public void calculatemonthlyInterest() {
        double monthlyinterest = (savingbalance * annualinterestrate / 12) / 100;
        savingbalance += monthlyinterest;
    }

    public void printsavingbalance() {
        System.out.println("Saving balance: Rs " + savingbalance);
    }

    public static void modifyinterestrate(double newrate) {
        annualinterestrate = newrate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance for saver1: Rs ");
        double balance1 = sc.nextDouble();
        System.out.print("Enter the balance for saver2: Rs ");
        double balance2 = sc.nextDouble();

        SavingAccount saver1 = new SavingAccount(balance1);
        SavingAccount saver2 = new SavingAccount(balance2);

        System.out.print("Enter the interest rate (percentage): ");
        double interestRate = sc.nextDouble();
        SavingAccount.modifyinterestrate(interestRate);

        System.out.println("Balance with interest of: " + interestRate + "%");
        saver1.calculatemonthlyInterest();
        saver1.printsavingbalance();
        saver2.calculatemonthlyInterest();
        saver2.printsavingbalance();

        sc.close();
    }
}
