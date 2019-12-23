package day20;

public class FindDogInSentence {
    public static void main(String[] args) {
        // write your code here

        String msg = "i dont like dog,dogs are cute,dogs are friendly";
        int lastCharIndex = msg.length() - 1;
        System.out.println("gettign 3 character");
        for (int x = 0; x <= lastCharIndex - 2; x++) {
           // System.out.println(x + ":" + msg.substring(x, x + 3));

            String current3chars = msg.substring(x, x + 3);

            if (current3chars.equals("dog")) {
                System.out.println("bingo"+x);


            }


        }
    }
}