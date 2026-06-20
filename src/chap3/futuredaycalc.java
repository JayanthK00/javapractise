import java.util.*;
public class futuredaycalc {
    public static void main(String[] args) {
        String[] days={"mon","tue","wed","thru","fri","sat","sun"};

        Scanner input=new Scanner(System.in);
        System.out.println("enter todays index example 0=mon 1=tue 2=wed....6=sat");
        int today=input.nextInt();

        if (today < 0 || today > 6) {
            System.out.println("Invalid day input");
            return;
        }

        System.out.println("enter the afterdays to be elapsed");
        int afterdays=input.nextInt();

        int futuredays=(today+afterdays)%7;

        System.out.println("today is"+days[today]);
        System.out.println("future day is"+days[futuredays]);
        input.close();


    }
}
