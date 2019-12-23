package repl;

import java.util.Scanner;

public class relp67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reversedWord = " ";
int x=word.length();
        //WRITE YOUR CODE HERE
        //int wordlength = scan.nextInt();
        //int lastCharIndex=word.length()-1;

        if (x < 5) {
            System.out.println("Too short!");
        } else if (x > 5) {
            System.out.println("Too long!");
        } else {

            //System.out.print(word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+wordcharAt(0));

            System.out.println(reversedWord);


            System.out.print(word.charAt(4));
            System.out.print(word.charAt(3));
            System.out.print(word.charAt(2));
            System.out.print(word.charAt(1));
            System.out.print(word.charAt(0));
        }
    }

        }



