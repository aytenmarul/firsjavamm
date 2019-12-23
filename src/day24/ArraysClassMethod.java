package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {
String [] superHeros= {"superman","Batman","Wonder woman","Aquaman","Cyborg","Flash"};

          System.out.println("Arrays.toString(superHeros) result: ");
          System.out.println(Arrays.toString(superHeros));

          String SuperHerosAsString=Arrays.toString(superHeros);
        System.out.println("SuperHerosAsString  result:");
System.out.println(SuperHerosAsString);

        System.out.println("SuperHerosAsString.charAt(0)  result");

        System.out.println(SuperHerosAsString.charAt(0));

        System.out.println("-------------");

int []number ={10,44,55,3,78};
        System.out.println("Array.toString(number) result:");
        System.out.println( Arrays.toString(number));


        double[] prices = new double[]{3.14, 5.5, 9.0};
        System.out.println("Arrays.toString(prices) result " + Arrays.toString(prices));

        // since the method give you back a string representation of array object
        // in this format [ firstItem , secondItem , thirdiTEM ..... ... lastItem]
        // i can save it into String variable

        String pricesString = Arrays.toString(prices);
        System.out.println("pricesString = " + pricesString);

        // we are looping over a String not an array so we keep looping until last character finishes
        // to make it obvious that [ ] and , are part of the String we got from the method
        for (int i = 0; i < pricesString.length(); i++) {
            System.out.println("character at index " + i + " is : " + pricesString.charAt(i));
        }

        // THE SOLE PURPOSE OF Arrays.toString(yourArray) is TO SEE WHAT IS INSIDE

        // for sorting an array in ascending order
        // sort    --->>  Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals  ---->> Arrays.equals(firstArray,secondArray)

    }
    }
