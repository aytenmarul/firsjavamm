package day21;

public class SkipAll5s {
    public static void main(String[] args) {
        // write your code here

        for (int x = 1; x <= 100; x++) {
            if (x % 5 == 0) {

                System.out.println("skipping" + x);
                continue;
            }
            System.out.println(x);

        }

   for(int x=1; x<=100; x++) {

       if (x % 5 != 0) {
           System.out.println(x);
       } else {
           System.out.println("skipping" + x);
       }

   }

    }
}