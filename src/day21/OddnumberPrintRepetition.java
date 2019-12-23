package day21;

public class OddnumberPrintRepetition {
    public static void main(String[] args) {
        // write your code her
//int x=0;
        for (int y = 1; y <= 4; y++) {
            System.out.println("iteratiton:" + y);

            for (int x = 1; x < 10; x++) {


                if (x % 2 == 1) {

                    System.out.print(x + "-");
                }

            }
            System.out.println();
        }

    }
}