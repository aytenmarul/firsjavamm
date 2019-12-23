package day22;

public class loopControlStatetment {

    public static void main(String[] args) {

        String msg = "  I struggle with Java I Like Java I love Java Everything is Awesome!";

        int charCount = msg.length();
        System.out.println("Character Count = " + charCount);
    /*    for (int x = 0; x < msg.length(); x++) {


            char currentChar = msg.charAt(x);

            if (currentChar == 'a') {
                System.out.println("found it");

                break;
            }
            System.out.println(currentChar);
*/
   /* 1, print every other letter
    meaning : skip a letter each time you go through the letter
	0123456789
    I struggle with  -->> Isrgl ih
    USE CONTINUE FOR THIS TASK
2,  when you reach letter a break the loop
    OTIONALLY ; BREAK WHEN YOU SEE 3RD A case insensitve

*/
       /*     int charCount=msg.length();
            System.out.println("Character Count="+charCount);
            for (int idx = 0; idx < charCount; idx++) {
if(idx%2==1) {
    continue;

}
    System.out.println(idx+":"+msg.substring(idx,idx+1));

}


*/
            for (int idx = 0; idx < charCount; idx++) {
                String currentChar = msg.substring(idx, idx + 1);

                if (currentChar.equalsIgnoreCase("a")) {
                    break;
                }
                System.out.println("currentChar=" + currentChar);


            }


        }
    }


