package day31;

public class voting {

    public static void main(String[] args) {
 checkEligibility(15);
checkEligibility(27);
int yourAge=12;
checkEligibility(yourAge);
    }

public static void checkEligibility( int age){// int age sonradan yazzdim

   //int age=15;
   if(age>18){
       System.out.println("you are eligible to vote");
   } else {
       System.out.println("you are not eligible");
   }





}


}
