package repl;

import java.util.Scanner;

public class exampleCom {

    public static void main(String[] args) {
        //WRITER
       Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the test:");

        String name=scan.next();
        //System.out.println(name);
  //      System.out.println("characterCount is :"+namelenght())

  //      System.out.println("characterCount is :"+namelenght());
        name=name.trim();
        System.out.println(name);

        System.out.println("message character count is " + name.length());

        System.out.println(name.isEmpty());




    }
}

