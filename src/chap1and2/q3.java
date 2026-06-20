package chap1and2;

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enterthe value of farheinhet:");
        double farheinhet=input.nextDouble();
        double celsius=(5.0/9)*(farheinhet-32);
        System.out.println("celsius"+celsius);
        double r=2,t=1;
        System.out.println(5.5* Math.pow(r+25,2.5+t));

    }
}
