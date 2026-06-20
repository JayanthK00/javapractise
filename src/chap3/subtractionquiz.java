import java.util.Scanner;
public class subtractionquiz {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=(int) (Math.random()*10);
        int number2=(int) (Math.random()*10);
        if(number1<number2){
            int temp=number1;
            number1=number2;
            number2=temp;
        }
        System.out.println("what is "+number1+" - "+number2+" ?");
        int answer=input.nextInt();
        if(answer==number1-number2){
            System.out.println("you are right");
        }
        else
            System.out.println("you are wrong\nthe right answer is ="+(number1-number2));
    }
}
