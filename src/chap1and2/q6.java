package chap1and2;

import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the purchase amount:");
        double purchaseamount= input.nextDouble();
        double tax=purchaseamount*6/100.0;
        System.out.println("sales tax is :$"+(int)(tax*100+0.5)/100.0);
        System.out.println("sales tax is :$"+Math.round(tax*100+0.5)/100.0);
    }
}
