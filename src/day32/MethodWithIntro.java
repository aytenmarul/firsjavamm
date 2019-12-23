package day32;

public class MethodWithIntro {
    public static void main(String[] args) {
        String name = giveMeMyName();
        System.out.println("name = " + name);


        int result = doubleThenumber(10);
        System.out.println("my result ="+result);
        System.out.println("result of doubling 100 is" + doubleThenumber(100) );
        System.out.println(doubleThenumber(5));
        System.out.println(doubleThenumber(15));
int add14to16Result=add2Numbers(25,7);
        System.out.println("add 25 to 7 result= "+add14to16Result);
        System.out.println(add2Numbers(25,7)+5);// 5 i sonradan ekledi

    }

    public static int doubleThenumber(int num) {
        System.out.println("I am goning to double the value of"+num);
        int result = num * 2;
        return result;
    }


    public static String giveMeMyName() {
        return "emine";
    }

    public static int add2Numbers(int num1,int num2){
        return num1+num2;
    }
}