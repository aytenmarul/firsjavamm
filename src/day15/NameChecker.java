package day15;

import java.util.Scanner;

public class NameChecker {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name plaese:");
        String name = scan.next();

        int lenghtOfTheName = name.length();
        System.out.println("NameChecker Of The Name=" + lenghtOfTheName);
        if (lenghtOfTheName < 4) {
            System.out.println("short name");
        } else if (lenghtOfTheName >= 4 && lenghtOfTheName <= 11) {

            System.out.println("medium name");
        } else {
            System.out.println("longer name ");
        }

        if (name.contains("a") || name.contains("e")) {


            System.out.println("name contain a or e");
        } else {

            System.out.println("i dont have both a or e");
        }

    }
    }