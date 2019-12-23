package day20;

public class sumofEvenOdd {
    public static void main(String[] args) {
        // write your code here
        int sumOfeven = 0;
        int sumOfodd = 0;
        for (int i = 10; i <= 100; i++) {

            if (i % 2 == 0) {
                sumOfeven = sumOfeven + i;
            } else {
                sumOfodd = sumOfodd + i;
            }
        }
            System.out.println("sumOfodd=" + sumOfodd);
            System.out.println("sumOfeven=" + sumOfeven);


        }
    }
