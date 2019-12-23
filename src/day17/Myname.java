package day17;

import java.util.Scanner;

public class Myname {

    public static void main(String[] args) {

        String name = "Ayten";


        //Scanner scan=new Scanner(System.in);

//Scanner scan=scan.nextLine();
       // System.out.println("enter name");
        int x = name.length();



        while (x<0) {

            System.out.print("index" + x + ":");


            System.out.println(name.charAt(x));
            ++x;
            System.out.print("index" + x + ":");

            System.out.println(name.charAt(x));
            //System.out.print("index" + x + ":");
            ++x;

            System.out.print("index" + x + ":");
            System.out.println(name.charAt(x));
            ++x;

            System.out.print("index" + x + ":");

            System.out.println(name.charAt(x));
            ++x;
            System.out.print("index" + x + ":");

            System.out.println(name.charAt(x));
            ++x;
        }
        //System.out.println(name.charAt(x));
        //++x;




    }
}
