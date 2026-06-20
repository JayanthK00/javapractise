package chap1and2;

public class q2 {
    public static void main(String[] args) {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;
        double denom = (a * d - b * c);
        if (denom == 0)
            System.out.println("it is not a linear equation");
    else{
        double x=(e*d-b*f)/denom;
        double y=(a*f-e*c)/denom;
                System.out.println("x="+x);
                System.out.println("y="+y);
            System.out.println("1.0/3.0 = "+1.0/3.0);
            System.out.println("1.0/3.0 = "+1.0f/3.0f);
            if(a*d-b*c!=0){
                System.out.println("this is ur answer");
            }

            }
        }
    }
