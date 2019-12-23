package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {


        long[] salaries = new long[]{10000L, 200000, 150000, 115000, 60000};

        for (long eachSalary : salaries) {
            System.out.println("Each salary=" + eachSalary);
        }
        for (long salary : salaries) {
            //if (salary > 100000) {

              //  System.out.println("salary=" + salary);
            //}
            if(salary<=10000){
                continue;
                }
            System.out.println("salary=" + salary);

        }
    }
}