package day20;

public class WorkingWithmoreThanChar {

    public static void main(String[] args) {

/*
System.out.println(name.substring(0,2));
        System.out.println(name.substring(2,4));

        System.out.println(name.substring(4,6));
        System.out.println(name.substring(6,8));
int x=0;
        System.out.println(name.substring(x,x+2));
           x=x+2;
        System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
     */   // write your code here



        String name="Gokyuzum";
        int charCount=name.length();
        int lastCharIndex=charCount-1;
        //x<=charCount-1
        for (int x = 0; x <= lastCharIndex-1; x+=2) {

            System.out.println(name.substring(x,x+2));
        }
    }
}