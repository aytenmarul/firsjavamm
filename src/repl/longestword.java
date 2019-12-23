package repl;

import java.util.Scanner;

public class longestword {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
    int lengthOfword1=word1.length();
//System.out.println("length Of word1=");
    int lengthOfword2=word2.length();
//System.out.println("length Of word1=");
if(lengthOfword1>lengthOfword2){
        System.out.println(word1);
    }else if(lengthOfword1<lengthOfword2){
        System.out.println(word2);


    }
}


}
