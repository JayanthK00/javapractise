package chap1and2;

import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalmillisec = System.currentTimeMillis();
        long totalsec = totalmillisec / 1000;
        long currsec = totalsec % 60;
        long totalmin = totalsec / 60;
        long currmin = totalmin % 60;
        long totalhour = totalmin / 60;
        long currhourgmt = totalhour % 24;
        System.out.println("enter the offset timezone to gmt:");
        double offset = input.nextDouble();
        double localhour = currhourgmt + offset;
        if (localhour < 0) {
            localhour += 24;
        }
            else if (localhour >= 24) {
            localhour -= 24;
        }
        int displayhour = (int) localhour;
        System.out.println("the current time is: " + displayhour + " : " + currmin + " : " + currsec);
    }
}
