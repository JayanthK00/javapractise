package chap1and2;

import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number with decimal point:");
        double amount= input.nextDouble();
        int remaining=(int)(amount*100);
        int dollars=remaining/100;
        remaining=remaining%100;
        int quarter=remaining/25;
        remaining=remaining%25;
        int dimes=remaining/25;
        remaining=remaining%10;
        int nickel=remaining/5;
        remaining=remaining%5;
        int penny=remaining;
        System.out.println("your amount "+amount+" consists of");
        System.out.println(dollars+"dollars");
        System.out.println(quarter+"quarters");
        System.out.println(dimes+"dimes");
        System.out.println(nickel+"nickel");
        System.out.println(penny+"pennies");



    }
}
