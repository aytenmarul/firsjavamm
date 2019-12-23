package day14;

import java.util.Scanner;

public class relp {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");


        int modelYear = scan.nextInt();

        if ((modelYear >= 1995 && modelYear < 1999) || (modelYear >= 2001 && modelYear < 2003) || (modelYear > 2004 && modelYear < 2006) ||
                (modelYear >= 2015 && modelYear < 2017)) {
            System.out.println("Your vehicle needs to be recalled!");
        } else  {
            System.out.println("Your vehicle is fine, enjoy!");
        }


    }
}