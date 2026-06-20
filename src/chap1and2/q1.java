package chap1and2;

public class q1 {
    public static void main(String[] args) {
        double curpop=312032486;
        double secondsinyear=365*24*606*60;
        double birthperyear=secondsinyear/7.0;
        double deathsperyear=secondsinyear/13.0;
        double immigrantsperyeear=secondsinyear/45.0;

        for(int year=1;year<=5;year++){
            curpop+=(birthperyear+immigrantsperyeear-deathsperyear);
            System.out.println("year "+year+" population : "+(long)curpop);
        }
    }
    
}
