package day21;

public class NameBreaker1 {

    public static void main(String[] args) {

        String name = "nursultan";


        for (int x = 0; x < name.length(); x++) {


            char currentChar = name.charAt(x);

            if (currentChar == 'l') {
                System.out.println("found it");

                break;
            }

            System.out.println(currentChar);
        }
    }
}


        //