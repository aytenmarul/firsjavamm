package day27;

import java.util.Arrays;

public class multi_dimesional_Array {
    public static void main(String[] args) {
int [] arr1D={1,2,3};
        System.out.println(arr1D.length);

int[] [] arr2D={{1,2,3},{4,5,6}};
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[0][2]);
        System.out.println(arr2D[1][1]);
        System.out.println(Arrays.toString(arr2D[1]));
        //Arrays.toString is only applicable to single dimensional arrays
        // Arrays.deepToString(multi-D Arrays):
       // System.out.println( Arrays.deepToString(arr2D));


        System.out.println(Arrays.deepToString(arr2D));
    }
    }
