package repl;

import java.util.Scanner;

public class week {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number:");
        int dayCode=scan.nextInt();


        switch (dayCode) {

        case 1:
            System.out.println(" Monday");
            break;  // used to get out of this branch
        case 2:
            System.out.println(" Tuesday");
            break;
        case 3:
            System.out.println(" Wednesday");


            break;
        case 4:
            System.out.println(" Thursday");

            break;
        case 5:
            System.out.println(" Friday");


            break;
        case 6:
            System.out.println(" Saturday");

            break;
        case 7:
            System.out.println(" Sunday");

            break;


    }

}

}
