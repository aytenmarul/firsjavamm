package repl;

import java.util.Scanner;

public class bool_ {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        //WRITE YOUR CODE HERE
        //word="Selim";
        boolean Happy = word.contains("H");

        System.out.println( word.contains("H"));

        String sentence = scan.nextLine();
        boolean Love = sentence.contains("Lo");

        System.out.println(sentence.contains("Bo"));

        //boolean sartedWithS= word.startedWith("S");t
        //System.out.println("started with S="+ startedWith );
//boolean endWithselim
    }
}


