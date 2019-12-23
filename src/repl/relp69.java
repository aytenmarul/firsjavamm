package repl;

import java.util.Scanner;

public class relp69 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        //if (word1.length()==3&&word2.length()==3){
        //  char c1=word.charAt(0);
        /// char c2=word.charAt(1);

        //System.out.println(word.charAt(0)+word.charAt(1)+word.charAt(0)+word.charAt(1));


        int charCount = word.length();
        int halfOfword = charCount / 2;
        if (word.length() % 2 == 0) {
            System.out.println(word.length()+word.length());
        }

    }
}