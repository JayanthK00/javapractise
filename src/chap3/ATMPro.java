import java.util.Scanner;
import java.security.SecureRandom;

public class ATMPro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        int correctPin = 1234;
        double balance = 20000;
        double dailyLimit = 5000;

        System.out.print("Enter PIN: ");
        int pin = input.nextInt();

        if (pin == correctPin) {

            int otp = rand.nextInt(9000) + 1000;
            System.out.println("OTP: " + otp);

            System.out.print("Enter OTP: ");
            int userOtp = input.nextInt();

            if (userOtp == otp) {

                System.out.print("Enter amount: ");
                double amt = input.nextDouble();

                if (amt <= balance) {

                    if (amt <= dailyLimit) {
                        balance -= amt;
                        System.out.println("Transaction successful ✅");
                        System.out.println("Balance: " + balance);
                    } else {
                        System.out.println("Daily limit exceeded ❌");
                    }

                } else {
                    System.out.println("Insufficient balance ❌");
                }

            } else {
                System.out.println("Invalid OTP ❌");
            }

        } else {
            System.out.println("Invalid PIN ❌");
        }

        input.close();
    }
}
