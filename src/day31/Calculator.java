package day31;

public class Calculator {
    public static void main(String[] args) {
     add(6,23);
     add(16,3);
     add(1,6);
  add3Number(1,4,100);

    }
public static void add(int num1, int num2){
    System.out.println("addition result is"+(num1+num2));
}
    public static void add3Number(int num1, int num2, int num3 ){
        System.out.println("3 number addition result is "+( num1+num2+num3));
    }
}
