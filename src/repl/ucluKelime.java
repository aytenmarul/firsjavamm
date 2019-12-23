package repl;

import java.util.Scanner;

public class ucluKelime {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        int word1Charactercount=scan.nextInt();
        int word2Charactercount=scan.nextInt();


        if (word1Charactercount==3&&word2Charactercount==3){
        }else {
            System.out.println("cannot merge");
        }

        char c1=word1.charAt(0);
        char c2=word1.charAt(1);
        char c3=word1.charAt(2);


       // char c1=word2.charAt(0);
        //char c2=word2.charAt(1);
        //char c3=word1.charAt(2);

        System.out.println(word1.charAt(0)+ ""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+""+word1.charAt(2)+""+word2.charAt(2));
    }
}

