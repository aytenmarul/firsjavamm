package day27;

import java.util.Arrays;

public class Multi_dimesinal_Arrays {
    public static void main(String[] args) {
        String[][] names = {{"selim", "ghoya"}, {"ayten", "ismail"}};
        System.out.println(names[1][0]);
        names[1][1] = "dilshat ";
        System.out.println(names[1][1]);
        System.out.println(Arrays.deepToString(names));
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
        for (int i = 0; i < numbers.length; i++) {

            //System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        int[][] ages = {{10}, {12, 13, 14, 15, 16,}, {18, 19, 20}};

        //System.out.println(ages);
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                if (ages[i][j] % 2 == 0) {
                    System.out.println(ages[i][j] + " ");
                }
            }
        }
        System.out.println("==================");
        int[] arr1D = {1, 2, 3};
        for (int each : arr1D) {
            System.out.println(each + " ");
        }
        System.out.println("===========");
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}};
        for (int[] eachelement : arr2D) {
            System.out.println(eachelement + " ");

        }
    }
}