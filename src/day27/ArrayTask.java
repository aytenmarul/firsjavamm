package day27;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
            int num, digit1, digit2, digit3, digit4, digit5;
            //WRITE YOUR CODE HERE

        Scanner scan =new Scanner(System.in);
            System.out.println("Enter your number:");
            num=scan.nextInt();
            String num1= num+"";
            for (int i=0;i<num1.length();i++) {
                System.out.println(num1.charAt(i));

            }
        }
    }
