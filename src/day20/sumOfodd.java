package day20;

public class sumOfodd {

    public static void main(String[] args) {
        // write your code here
        int sum = 0;
        for (int i = 10; i < 100; i++) {

            if (i % 2 !=0) {

                System.out.println();
                sum += i;

               System.out.println("sum = "+sum);
            }
        }

    }
}
