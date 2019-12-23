package day23;

public class ForloopFindMax {
    public static void main(String[] args) {
        long[] salaries = new long[]{10000L, 200000, 150000, 115000, 60000};

        long max = salaries[0];

        for (long salary : salaries) {

            if (salary > max) {
                max = salary;
            }
            }
                System.out.println("max salary:"+max);

        }
    }