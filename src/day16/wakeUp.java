package day16;

import java.util.Scanner;

public class wakeUp {
    public static void main(String[] args) {
        //Scanner word1=scan Scanner(System.in);


        String word1="java";
        String word2= "";
        //System.out.println("");
        System.out.print("Enter the value here: ");

       // word2="" +word1.charAt(3)+ word1.charAt(2)+ word1.charAt(1) +word1.charAt(0);
      // word2 = word2 +word1.charAt(3)+ word1.charAt(2)+ word1.charAt(1) +word1.charAt(0);
       word2 += word1.charAt(3)+""+ word1.charAt(2)+ word1.charAt(1) +word1.charAt(0);
        //System.out.println(word1.charAt(3)+ ""+ word1.charAt(2)+ ""+ word1.charAt(1) +""+word1.charAt(0) );

        System.out.println("word2 = "+word2);
        // I want to add world at the end of it
        String msg = "Hello ";
        //msg = msg + "World!" ;
        msg += "World!";
        System.out.println("msg = " + msg);





    }
}
