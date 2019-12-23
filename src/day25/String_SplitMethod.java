package day25;

import java.util.Arrays;

public class String_SplitMethod {


    public static void main(String[] args) {

        String sentence = "I love java";
        String[] allwords = sentence.split(" ");
        System.out.println("allwords=" + Arrays.toString(allwords));
        System.out.println("how many word do i have in this sentence ?" + allwords.length);
        System.out.println("last word in this sentence is " + allwords[allwords.length - 1]);

        String sentence2 = "Everthing is awesome !!";

        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr=" + Arrays.toString(splitBy_e_Arr));
        for (String eachPiece : splitBy_e_Arr) {

            System.out.println("eachPiece=<" + eachPiece + ">");
        }

    }
}