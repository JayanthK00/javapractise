package chap3;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secret = (int)(Math.random() * 100) + 1;

        int tries = 0;

        while (true) {
            System.out.print("Guess number: ");
            int guess = input.nextInt();
            tries++;

            if (guess == secret) {
                System.out.println("Correct in " + tries + " tries 🎯");
                break;
            } else if (guess > secret) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }

        input.close();
    }
}
