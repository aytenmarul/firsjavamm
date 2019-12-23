package day22;

public class arrayPractice {
    public static void main(String[] args) {


        double[] prices = new double[4];
        System.out.println(prices[0]);
        System.out.println(prices);
        prices[0] = 2.46;
        prices[1] = 12.96;
        prices[2] = 992.1;
        prices[3] = 500;
        // prices[4]=65.1;
        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        // System.out.println(prices[4]);
        // System.out.println(prices[5]);


        char[] nameChars = new char[7];
        nameChars[0] = 'A';
        nameChars[1] = 'y';
        nameChars[2] = 't';
        nameChars[3] = 'e';
        nameChars[4] = 'n';
        //nameChars [5]='n';
        // nameChars [6]='n';
        System.out.println(nameChars[0]);
        System.out.println(nameChars[1]);
        System.out.println(nameChars[2]);
        System.out.println(nameChars[3]);
        System.out.println(nameChars[4]);
        // System.out.println(nameChars[5]);
        // System.out.println(nameChars[6]);
        System.out.println(nameChars);
        boolean[] yesNo = new boolean[5];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = 10 > 7;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);


    }


}