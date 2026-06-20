package chap1and2;

public class GrowthCalculation {
    public static void main(String[] args) {

        double initialUsers = 1000;
        double targetUsers = 1000000;
        double dailyGrowthRate = 0.04;

        // Days required to reach 1 million users
        double days =
                Math.log(targetUsers / initialUsers)
                        / Math.log(1 + dailyGrowthRate);

        // Yearly compounded growth percentage
        double yearlyGrowth =
                (Math.pow(1 + dailyGrowthRate, 365) - 1) * 100;

        System.out.println("Days required: "
                + Math.ceil(days));

        System.out.println("Yearly compounded growth %: "
                + yearlyGrowth);
        // users after one year
        double finalUsers= initialUsers*Math.pow(1+dailyGrowthRate,365);

        //no of users increased
        double increasedUsers =
                finalUsers - initialUsers;

        System.out.println("Users after 1 year : "
                + (long) finalUsers);

        System.out.println("Users increased in 1 year : "
                + (long) increasedUsers);


    }
}
