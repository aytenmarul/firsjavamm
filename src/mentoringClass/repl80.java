package mentoringClass;

import java.util.Scanner;

public class repl80 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char StartChar = scan.next().charAt(0);
        char EndChar = scan.next().charAt(0);
        if (StartChar == EndChar) {
            System.out.println(EndChar+" found");
        } else {
            while (StartChar != EndChar) {

                if (StartChar == 'A') {
                    StartChar = 'B';
                    System.out.print("right");
                } else if (StartChar == 'B') {
                    StartChar = 'C';
                    System.out.print("down");
                } else if (StartChar == 'C') {
                    StartChar = 'D';
                    System.out.print("left");
                } else if (StartChar == 'D') {
                    StartChar = 'A';
                    System.out.print("up");
                }
                if(StartChar !=EndChar){
                    System.out.print(" > ");
                }else{
                    System.out.print(": "+EndChar+ " found");

                }

            }
        }
    }
}