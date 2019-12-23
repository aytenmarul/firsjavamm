package repl;

import java.util.Scanner;

public class example {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice=0;
        //WRITE YOUR CODE HERE


        if(numberOfBedrooms==1){
            System.out.println("One Bedroom Selected");
            System.out.println(" set startingPrice as "+ 1000);

        }else if(numberOfBedrooms==2){
            System.out.println	("Two Bedroom Selected");
            System.out.println(	"set startingPrice as "+ startingPrice);

        }else if(numberOfBedrooms==3){
            System.out.println ("Three Bedroom Selected");
            System.out.println( "startingPrice as"+ startingPrice );

        }else{
            System.out.println( "No such Bedrooms available");
        }
        System.out.println("Starting Price: value");


    }
}
        //


