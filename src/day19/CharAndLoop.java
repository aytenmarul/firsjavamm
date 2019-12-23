package day19;

public class CharAndLoop {


    public static void main(String[] args) {

//char myChar=101;


         char myChar='A';
       System.out.println(myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println('A'>'B');

        System.out.println('Z'>'B');


        for (char iChar = 'A'; iChar<='Z'; iChar++) {
            System.out.print(iChar+" ");
        }

        System.out.println();
        for (char kChar = 'Z'; kChar>='A'; kChar--) {
            System.out.print(kChar+" ");
        }


    }
}
