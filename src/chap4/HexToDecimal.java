package chap4;

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = input.next().toUpperCase();

        int decimal = 0;

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);

            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                digit = ch - 'A' + 10;
            } else {
                System.out.println("Invalid hexadecimal number!");
                return;
            }

            decimal = decimal * 16 + digit;
        }

        System.out.println("Decimal value = " + decimal);
    }
}
