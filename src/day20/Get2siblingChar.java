package day20;

public class Get2siblingChar {

    public static void main(String[] args) {
        // write your code here
//     Ay----02
 //    yr---12
  //   ra  --23
        String name ="ayra";
        //int x=0;
      /*  System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
        x=x+2;
       */// System.out.println(name.substring(x,x+2));

        System.out.println(name.substring(0,2));
        System.out.println(name.substring(1,3));

        System.out.println(name.substring(2,4));

int lastCharIndex=name.length()-1;
        for (int x = 0; x <=lastCharIndex-1 ; x++) {
            System.out.println(name.substring(x,x+2));
        }
        System.out.println("gettign 3 character");
        for (int x = 0; x <=lastCharIndex-2 ; x++) {
            System.out.println(name.substring(x,x+3));
        }




    }
}