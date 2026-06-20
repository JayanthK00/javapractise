package chap1and2;
import java.util.Scanner;
public class sumofdig {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }

            System.out.println(sum);
            input.close();
        }
    }

