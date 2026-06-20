package chap1and2;

public class q9 {
    public static void main(String[] args) {
        double currenttpop=312032486;
        double yearinsec=365*24*60*60;
        double birthrate=yearinsec/7.0;
        double immigrate=yearinsec/45.0;
        double deathrate=yearinsec/13.0;
        for(int i=1;i<=5;i++){
            currenttpop=currenttpop+birthrate+immigrate-deathrate;
            System.out.println("after "+ i +" year new population: "+(long)currenttpop);
        }
        System.out.println();
        System.out.println((long)currenttpop);
        System.out.println();
        currenttpop=312032486;

        for(int i=1;i<=5;i++) {
            currenttpop=currenttpop+birthrate+immigrate-deathrate;
            System.out.printf("after %d year new population: %.0f%n", i, currenttpop);
        }

    }
}
