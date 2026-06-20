import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LotteryGame {

    private static final int EXACT_MATCH_PRIZE = 10000;
    private static final int ALL_DIGITS_PRIZE = 3000;
    private static final int ONE_DIGIT_PRIZE = 1000;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lotteryNumber = generateLotteryNumber();

        System.out.print(
                "Enter your lottery pick (00-99): ");

        int guess = input.nextInt();

        System.out.println(
                "Lottery number: "
                        + String.format("%02d",
                        lotteryNumber));

        evaluateGuess(
                lotteryNumber,
                guess);

        input.close();
    }

    private static int generateLotteryNumber() {

        return ThreadLocalRandom
                .current()
                .nextInt(100);
    }

    private static void evaluateGuess(
            int lottery,
            int guess) {

        if (guess == lottery) {

            System.out.println(
                    "Exact match: You win $"
                            + EXACT_MATCH_PRIZE);

            return;
        }

        int lotteryTens = lottery / 10;
        int lotteryOnes = lottery % 10;

        int guessTens = guess / 10;
        int guessOnes = guess % 10;

        if (isReversedMatch(
                lotteryTens,
                lotteryOnes,
                guessTens,
                guessOnes)) {

            System.out.println(
                    "Match all digits: You win $"
                            + ALL_DIGITS_PRIZE);

            return;
        }

        if (hasAnyDigitMatch(
                lotteryTens,
                lotteryOnes,
                guessTens,
                guessOnes)) {

            System.out.println(
                    "One digit matched: You win $"
                            + ONE_DIGIT_PRIZE);

            return;
        }

        System.out.println(
                "Sorry, no match.");
    }

    private static boolean isReversedMatch(
            int lotteryTens,
            int lotteryOnes,
            int guessTens,
            int guessOnes) {

        return lotteryTens == guessOnes
                && lotteryOnes == guessTens;
    }

    private static boolean hasAnyDigitMatch(
            int lotteryTens,
            int lotteryOnes,
            int guessTens,
            int guessOnes) {

        return guessTens == lotteryTens
                || guessTens == lotteryOnes
                || guessOnes == lotteryTens
                || guessOnes == lotteryOnes;
    }
}