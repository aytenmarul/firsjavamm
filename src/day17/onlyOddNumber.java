package day17;

public class onlyOddNumber {


    public static void main(String[] args) {

      /*  int x = 100;



                while (x > 0) {
                    // if x divided by 2 have remainder
                    // for example 5/2=2 1 remain   5%2=1  1!=0
                    if (x % 2 != 0) { // x % 2 == 1 does same thing
                        System.out.println(x + " is odd number");
                    }
                    --x;
                }
             */
                int cnt = 0;
                while (cnt <= 50) {

                    System.out.print(cnt + " ");
                    cnt += 9; // cnt = cnt + 2 ;

                }
                System.out.println("------------");

                int cnt2 = 5;
                while (cnt2 <= 50) {

                    System.out.print(cnt2 + " ");
                    cnt2 += 4;

                }


            }


        }

