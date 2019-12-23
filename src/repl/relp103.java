package repl;

import java.util.Scanner;

public class relp103 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

       // for(int i=1;i<=n; i++){
          //  for(int j=1; j<=n; j++){
         //    System.out.println(""+i+j);

        String star=" * ";
      /*  System.out.println(star);
        star=star+" * ";
        System.out.println(star);
        star=star+" * ";
        System.out.println(star);
        star=star+" * ";
        System.out.println(star);

        star=star+" * ";
        System.out.println(star);
*/

        for (int x =1; x <=n; x++) {
            star=star+" * ";
            //  star += " * ";
            System.out.println(x + "  " + star );





        }
    }
}


