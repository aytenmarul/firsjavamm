package repl;

public class denme {


        public static void main(String[] args) {

            int sumOfEven = 0;
            int sumOfOdd = 0;

            for (int money = 10; money <= 100; money++) {

                // if it's even number , add that to sumOfEven
                if (money % 2 == 0) {
                    sumOfEven = sumOfEven + money;
                    // if it's odd number , add that to sumOfOdd
                } else {
                    sumOfOdd = sumOfOdd + money;
                }

            }
                System.out.println("sumOfOdd = " + sumOfOdd);
                System.out.println("sumOfEven = " + sumOfEven);
            }
        }



