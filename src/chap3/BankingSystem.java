import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 10000;

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = input.nextInt();

            if (ch == 1) {
                System.out.println("Balance: " + balance);
            }
            else if (ch == 2) {
                System.out.print("Enter amount: ");
                double amt = input.nextDouble();
                balance += amt;
                System.out.println("Deposited.");
            }
            else if (ch == 3) {
                System.out.print("Enter amount: ");
                double amt = input.nextDouble();

                if (amt <= balance) {
                    balance -= amt;
                    System.out.println("Withdrawn.");
                } else {
                    System.out.println("Insufficient balance!");
                }
            }
            else if (ch == 4) {
                System.out.println("Thank you!");
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }

        input.close();
    }
}
