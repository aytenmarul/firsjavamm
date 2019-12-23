package day22;

public class loopingThroughArray {
    public static void main(String[] args) {


        int[] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

       // System.out.println(scores[0]);
      //  System.out.println(scores[1]);
      //  System.out.println(scores[2]);
      //  System.out.println(scores[3]);

        int itemCount=scores.length;
        int lastItemIndex=itemCount-1;

        String name="jon snow";
        //int charCount=name.length();
       // for (int x = 0; x <lastItemIndex ; x++) {

       // for (int x = 0; x <itemCount-1 ; x++) {


        for (int x = 0; x <itemCount ; x++) {
            System.out.println(scores[x]);
        }

    }
}