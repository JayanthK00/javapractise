import java.util.Scanner;
import java.security.SecureRandom;

public class OTPSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        // -------- OTP GENERATION --------
        int otp = rand.nextInt(10000);   // 0 - 9999

        long generatedTime = System.currentTimeMillis();

        System.out.printf("Your OTP is: %04d%n", otp);
        System.out.println("(Valid for 30 seconds, max 3 attempts)");

        // -------- VALIDATION SETTINGS --------
        int maxAttempts = 3;
        long expiryTime = 30_000; // 30 seconds

        boolean verified = false;

        // -------- OTP CHECK LOOP --------
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            System.out.print("Enter OTP: ");
            int userOtp = input.nextInt();

            long currentTime = System.currentTimeMillis();

            // Check expiry
            if (currentTime - generatedTime > expiryTime) {
                System.out.println("OTP expired!");
                break;
            }

            // Check correctness
            if (userOtp == otp) {
                System.out.println("OTP Verified Successfully ✅");
                verified = true;
                break;
            } else {
                System.out.println("Wrong OTP ❌");

                if (attempt < maxAttempts)
                    System.out.println("Attempts left: " + (maxAttempts - attempt));
            }
        }

        if (!verified) {
            System.out.println("Verification Failed. Please request new OTP.");
        }

        input.close();
    }
}

