package repl;

import java.util.Scanner;

public class relp60 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // ------------------------------------------

        System.out.println("Please enter guest name:");
        String guestName=input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String newGuest=input.nextLine();
        while(newGuest.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            String name=input.next();
            guestName=guestName+", "+name;
            System.out.println("Do you want to enter new guest name:");
            newGuest=input.next();
        }
        System.out.println("Guest's list: "+ guestName);

    }
}
