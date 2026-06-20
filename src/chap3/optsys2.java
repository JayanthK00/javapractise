import java.security.SecureRandom;
import java.util.Scanner;

public class optsys2 {

    private static final SecureRandom RANDOM = new SecureRandom();

    private static final int MAX_ATTEMPTS = 3;
    private static final int MAX_RESENDS = 2;
    private static final long OTP_EXPIRY = 30_000;

    private static int otp;
    private static long generatedTime;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int resendCount = 0;

        generateOtp();

        while (true) {

            int attempts = 0;
            boolean verified = false;

            while (attempts < MAX_ATTEMPTS) {

                if (isExpired()) {
                    System.out.println("\nOTP Expired!");
                    break;
                }

                System.out.print("Enter OTP: ");
                int userOtp = input.nextInt();

                if (userOtp == otp) {
                    System.out.println("\nOTP Verified Successfully ✅");
                    verified = true;
                    break;
                }

                attempts++;

                System.out.println("Invalid OTP ❌");

                if (attempts < MAX_ATTEMPTS) {
                    System.out.println(
                            "Attempts left: "
                                    + (MAX_ATTEMPTS - attempts));
                }
            }

            if (verified) {
                break;
            }

            if (resendCount >= MAX_RESENDS) {
                System.out.println(
                        "\nMaximum OTP requests reached.");
                break;
            }

            System.out.print(
                    "\nRequest new OTP? (Y/N): ");

            char choice =
                    input.next().toUpperCase().charAt(0);

            if (choice != 'Y') {
                break;
            }

            resendCount++;
            generateOtp();
        }

        System.out.println(
                "\nVerification session ended.");

        input.close();
    }

    private static void generateOtp() {

        otp = RANDOM.nextInt(10000);

        generatedTime =
                System.currentTimeMillis();

        System.out.printf(
                "\nGenerated OTP : %04d%n",
                otp);

        System.out.println(
                "Valid for 30 seconds");
    }

    private static boolean isExpired() {

        return System.currentTimeMillis()
                - generatedTime
                > OTP_EXPIRY;
    }
}