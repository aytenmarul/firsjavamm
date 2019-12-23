package day25;

import java.util.Arrays;

public class StringToArray {

    public static void main(String[] args) {

        String name = "ayten";

        char[] allCharInName = name.toCharArray();
        for (char eachChar : allCharInName) {
            System.out.println("eachChar=" + eachChar);
        }
        int count = 0;
        for (char eachChar : allCharInName) {
            if (eachChar == 'a') {
                ++count;
            }
        }
        System.out.println("count=" + count);
    }
}