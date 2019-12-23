package day29;

import java.util.Arrays;

public class StringReview {
    public static void main(String[] args) {

      String hero1="Superman-clark-kent";

String[] heroSplitted=hero1.split("-");

        System.out.println("heroSplitted="+ Arrays.toString(heroSplitted));;

        System.out.println("hero code is "+heroSplitted[0]+"and intendetiy"+heroSplitted[1]);
    }
}
