package chap1and2;

import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the total amount");
        double totalamount=input.nextDouble();
        double cents=totalamount*100;
        double dollars=cents/100;
        double remcents=cents%100;
        double quarts=cents/25;
        double remquarts=quarts%2;
    }
}
