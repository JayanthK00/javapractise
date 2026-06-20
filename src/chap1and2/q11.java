package chap1and2;

public class q11 {
    public static void main(String[] args) {
        double servers = 100000;

        int firstMillionMonth = -1;

        for (int month = 1; month <= 24; month++) {

            servers = servers * 1.14;

            System.out.println(
                    "Month " + month +
                            " Active Servers : " + (long) servers);

            if (servers >= 1000000 && firstMillionMonth == -1) {
                firstMillionMonth = month;
            }
        }

        System.out.println(
                "\nFirst crossed 1 million servers at month : "
                        + firstMillionMonth);
    }
}


