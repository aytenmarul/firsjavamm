package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {

        //String[] students = {"abbos", "zulyar", "zhibek", "hasan", "ayten"};


        String students="Ayten,Zulyar,Zhibek,Hasan,Abbos,Susan";
        String namesArrays[]=students.split(",");

        System.out.println(Arrays.toString(namesArrays));
        System.out.println("length of nameArrays is"+namesArrays.length);

      int studentCount=namesArrays.length;




String name = namesArrays[0];
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + "-");
        }

        System.out.println();

        String name2 = namesArrays[2];
        for (int i = 0; i < name2.length(); i++) {
            System.out.print(name2.charAt(i) + "-");
        }

        System.out.println();






    }
}