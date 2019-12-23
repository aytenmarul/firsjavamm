package day32;

import java.util.Arrays;

public class ArrayPracticewithMethod {
    public static void main(String[] args) {
printArrayItems(new int[]{ 1,6,5,3,12,3});
int [] scores={2,5,23,4,5,6};
printArrayItems(scores);

        }

public static void printArrayItems(int [] nums){

    System.out.println("array has items:"+Arrays.toString(nums));
}

}
