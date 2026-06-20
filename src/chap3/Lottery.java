import java.util.*;

public class Lottery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lottery = 37;

        System.out.print("Enter guess: ");
        int guess = input.nextInt();

        if (guess == lottery) {
            System.out.println("Exact Match");
            return;
        }

        String lot = String.format("%02d", lottery);
        String gus = String.format("%02d", guess);

        char[] lotDigits = lot.toCharArray();
        char[] guessDigits = gus.toCharArray();

        Arrays.sort(lotDigits);
        Arrays.sort(guessDigits);

        if (Arrays.equals(lotDigits, guessDigits)) {
            System.out.println("All Digits Match");
            return;
        }

        for (char g : guessDigits) {
            for (char l : lotDigits) {

                if (g == l) {
                    System.out.println("One Digit Match");
                    return;
                }
            }
        }

        System.out.println("No Match");
    }
}
