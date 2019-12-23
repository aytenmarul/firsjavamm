package day18;

public class even_Number {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("fizz number");



            }

        }
    }
}