package repl;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        //CODE HERE

        //int scan=scan.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal ");
        } else if (num1 > num2) {
            System.out.println(num1 + "is grater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + "is grater than " + num1);
        }


    }
}



