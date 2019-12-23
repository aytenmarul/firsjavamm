package repl;

import java.util.Scanner;

public class repl96 {


        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            String separator = scan.next();
            int count = scan.nextInt();
            String sentence=word;
            for (int i = 1; i <count; i++) {
                sentence+=separator+word;
            }
            System.out.println(sentence);
        }
    }

