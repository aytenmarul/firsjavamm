package day30;

import java.util.Arrays;

public class SplitAbdDefine {
    public static void main(String[] args) {
    String sentence="i love java java java";

String[] wordsArray1=sentence.split(" ",2);
        String[] wordsArray2=sentence.split(" ",3);




        System.out.println("wordsArray1="+Arrays.toString(wordsArray1));



        System.out.println("wordsArray2="+Arrays.toString(wordsArray2));
        System.out.println("wordsArray size="+wordsArray1.length);




    }


}

