package repl;

import java.util.Scanner;

public class relp68 {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //WRITE YOUR CODE HERE
            int wordlength=scan.nextInt();


            char c1=word.charAt(0);
            char c2=word.charAt(1);
            char c3=word.charAt(2);
            char c4=word.charAt(3);


            if (wordlength<5){
                System.out.println("Too short!");
            }else if(wordlength>5){
                System.out.println("Too long!");
            }else {

                System.out.print(word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+ word.charAt(0) );

            }




            int characterCount=word.length();
        }
    }
