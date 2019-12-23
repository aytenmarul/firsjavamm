package repl;

import java.util.Scanner;

public class repl102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();


        // System.out.println(str.substring(i,strlengtg());

        String word = str.substring(0,n);
        System.out.println(str.substring(n).contains(word));
    }
}

