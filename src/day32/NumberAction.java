package day32;

public class NumberAction {
    public static void main(String[] args) {


        repeatString("Java", 3);
        repeatString("DO NOT TOUCH WORKING CODE !", 5);

        countDownByEvenNumber50to0();
        countDownByEvenNumber1toX(10, 6);

    }

/*
    /**
     * Create static void methods as below
     *
     * String repeater
     * this method has 2 parameters
     *     String strToRepeat and int count
     *    repeat printing the string as many time as <count> number define
     *
     * skipCountBy3From0to50
     *
     * * create a method that has no parameter
     * and skip count by 3 from 0 to 50
     *
     * countDownByEvenNumberFrom50to0
     * * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     * for example 50 , 48 , 46 .....0
     *
     * print1toX
     * * create a method that has 1 int parameter called x
     * print from 1 to that number in one line
     * print an empty line after the print.
     *
     *
     */

    /*
     * repeatString
     *  this method has 2 parameters
     *     String strToRepeat and int count
     *    repeat printing the string as many time as <count> number define
           repeatString("Java", 3) -->> Java Java Java
    * */
    public static void repeatString(String strToRepeat, int count) {

        for (int i = 1; i <= count; i++) {
            System.out.print(strToRepeat + " ");
        }
        System.out.println();

    }

    public static void countDownByEvenNumber50to0() {
        for (int i = 50; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void countDownByEvenNumber1toX(int x, int y) {
        for (int i = x; i >= y; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();


    }


}
