package chap1and2;
public class CpuUsageSimulation {

    public static void main(String[] args) {

        // Initial CPU usage
        double cpuUsage = 20;

        // Growth rate (9%)
        double growthRate = 0.09;

        // Store first day crossing 95%
        int firstCrossDay = -1;

        // Simulate for 30 days
        for (int day = 1; day <= 30; day++) {

            // Increase CPU usage by 9%
            cpuUsage = cpuUsage * (1 + growthRate);

            // Print daily CPU usage
            System.out.println(
                    "Day " + day +
                            " CPU Usage : " +
                            String.format("%.2f", cpuUsage) + "%");

            // Detect first day crossing 95%
            if (cpuUsage >= 95 && firstCrossDay == -1) {

                firstCrossDay = day;
            }
        }

        // Print threshold result
        if (firstCrossDay == -1) {

            System.out.println(
                    "\n95% CPU usage was never reached.");

        } else {

            System.out.println(
                    "\nFirst day crossing 95% : "
                            + firstCrossDay);
        }

        // Final CPU usage after 30 days
        System.out.println(
                "Final CPU Usage after 30 days : "
                        + String.format("%.2f", cpuUsage) + "%");

        // Yearly compounded growth percentage
        double yearlyGrowth =
                (Math.pow(1 + growthRate, 365) - 1) * 100;

        System.out.println(
                "Yearly compounded growth % : "
                        + yearlyGrowth);

        // CPU usage after 1 year
        double yearlyCpuUsage =
                20 * Math.pow(1 + growthRate, 365);

        System.out.println(
                "CPU Usage after 1 year : "
                        + yearlyCpuUsage + "%");

        // Exact day to reach 95% without loop
        double exactDay =
                Math.log(95.0 / 20.0)
                        / Math.log(1 + growthRate);

        System.out.println(
                "Exact day to reach 95% : "
                        + exactDay);

        System.out.println(
                "Crosses 95% on day : "
                        + (int)Math.ceil(exactDay));
    }
}
