package day31;

public class Calculator2 {
   
    public static void main(String[] args) {

      // char operator = '/';  // it can be + - * /
       // int num1 = 15;
      // int num2 = 3;
        calculate(10, 30, '-');
        calculate(20, 10, '+');
        calculate(40, 3, '*');
        calculate(40, 4, '/');
       calculate(40, 4, 'A');   //buda invalid operator icin

    }
                       
    // the order of method parameter decide how caller of this method should call it
    public static void calculate(int num1, int num2,char operator) {

        switch (operator) {

            case '+':
                System.out.println("Addition result is " + (num1 + num2));
                break;
            case '-':
                System.out.println("Substraction result is " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication result is " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division result is " + (num1 / num2));
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }
    }
    }