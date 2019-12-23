package day22;

public class canvasModulLingGenetor {
    public static void main(String[] args) {
        // write your code here


        //
       /* this will lead you to day 21
        https://learn.cybertekschool.com/courses/278/modules#3318
        this will lead you to day 22
        https://learn.cybertekschool.com/courses/278/modules#3319
        this will lead you to day 23
        https://learn.cybertekschool.com/courses/278/modules#3320
        this will lead you to day 24
        */
        String baseURL = "https://learn.cybertekschool.com/courses/278/modules#";
        String dayMsg = "This will lead you to day";

       // for (int modulenumber = 3317; modulenumber <= 3317 + 35; modulenumber++) ;
       // System.out.println(moduleNumber);
   // }


        for(int day=21; day<=56; day++) {

       System.out.println(dayMsg + day);

            System.out.println(baseURL+(3317-21+day));
   }
    }
}