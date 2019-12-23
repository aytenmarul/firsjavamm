package day27;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int num=10;
        int[] arr = {10, 20, 30, 40, 50, 60};
   String str=Arrays.toString(arr);
        System.out.println(str);

        int num1 = arr[arr.length - 1];
        //               6      -    1   = 5
        System.out.println(num1);

        int [] numbers= new int[5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan =new Scanner(System.in);
       // System.out.println("Enter an int number: ");
for (int i=0; i<5; i++){

    System.out.println("Enter an int number: ");
int input=scan.nextInt();
numbers[i]=input;

}

        System.out.println(Arrays.toString(numbers));

Arrays.sort(numbers);
int largestNumber=numbers[numbers.length-1];
      int minNumber=numbers[0];
        System.out.println("largest number is:"+largestNumber);
        System.out.println("minimum number is:"+minNumber);

    }
}