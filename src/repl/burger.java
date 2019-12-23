package repl;

import java.util.Scanner;

public class burger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
         word="Selim";
        System.out.println("word="+word);
        System.out.println( word.contains("S"));
        boolean Selim = word.contains("S");

        sentence="Cute selim";
        System.out.println("sentence= "+sentence);
        System.out.println(sentence.contains("Cu"));
        boolean CuteSelim = sentence.contains("Cu");

        //boolean sartedWithS= word.startedWith("S");t
        //System.out.println("started with S="+ startedWith );
//boolean endWithselim
    }
}