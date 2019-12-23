package day30;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
     String car="Lexus-IS-F";
     String[] carSplitted=car.split("-",2);
        System.out.println("carSplitted="+Arrays.toString(carSplitted));
        System.out.println("car="+car);

String model=carSplitted[1];
        System.out.println("model="+model);


    }
}
