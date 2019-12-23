package day22;

public class arrayintro {

    public static void main(String[] args) {


     int num1=10;

        System.out.println("num1="+num1);

     int[] scores=new int[4];
scores[0]=95;
scores[1]=70;
scores[2]=88;
scores[3]=100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
scores[1]=99;
        System.out.println(scores[1]);

int []numbers=new int[3];

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

byte [] data=new byte[4];
data[0]=10;
data[1]=20;
        data[2]=20;
        data[3]=20;


        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);




        data[3]=127;
        System.out.println(data[3]);
    }


    }
