import java.util.Scanner;

public class TaxSingle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] limits = {
                8350,
                33950,
                82250,
                171550,
                372950
        };

        double[] rates = {
                0.10,
                0.15,
                0.25,
                0.28,
                0.33,
                0.35
        };

        System.out.print("Enter income: ");
        double income = input.nextDouble();

        double tax = 0;
        double prev = 0;

        for (int i = 0; i < limits.length; i++) {

            if (income > limits[i]) {
                tax += (limits[i] - prev) * rates[i];
                prev = limits[i];
            } else {
                tax += (income - prev) * rates[i];
                break;
            }
        }

        if (income > limits[limits.length - 1]) {
            tax += (income - limits[limits.length - 1])
                    * rates[rates.length - 1];
        }

        System.out.printf("Tax = %.2f%n", tax);

        input.close();
    }
}