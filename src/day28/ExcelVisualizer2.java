package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {
    public static void main(String[] args) {

        int[][] myExcel = {{10, 27, 88, 99}, {87, 99, 100}, {90, 45, 65}};
        System.out.println(Arrays.deepToString(myExcel));
        for (int[] eachRow:myExcel){
for(int eachCell :eachRow){
            System.out.print(eachCell+"");

    }
          System.out.println();
}
    }
}