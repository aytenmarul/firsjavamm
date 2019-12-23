package day19;

public class FindingTheCount {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {
                System.out.print(i + ",");
                ++counter;
            }
        }
        System.out.print("counter=" + counter);

        String name = "Esra Fidan";
        System.out.println(name.charAt(0) == 'a');
        int countofA = 0;
        for (int x = 0; x < name.length(); x++) {
            System.out.println(name.charAt(x));
            if (name.charAt(x) == 'a') {
                System.out.println("bingo found it");
                ++countofA;
            }
        }
        System.out.println("countOfA=" + countofA);
    }
}