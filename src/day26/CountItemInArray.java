package day26;

import java.util.Arrays;

public class CountItemInArray {

    public static void main(String[] args) {

        String[] marvelHeros = {"iron man", "Capital America", "Spiderman", "Black Panther", "hulk", "Black widow", "wanda", "Capital Marvel"};
        System.out.println("marvel Heros=" + Arrays.toString(marvelHeros));

        int sizeOfArray = marvelHeros.length;
        System.out.println("heros count=" + sizeOfArray);
        String itemToSearch = "Black widow";
        int countOfItem = 0;

        for (String eachHero : marvelHeros) {

            if (eachHero.equals(itemToSearch)) {

                countOfItem++;
            }
        }
        System.out.println("countOfitem =" + countOfItem);
        int cntOfBlackInName = 0;
        for (String eachHero : marvelHeros) {

            if (eachHero.toLowerCase().contains("black")) {
                cntOfBlackInName++;
            }
        }
        System.out.println("cntOfBlackInNmame=" + cntOfBlackInName);
    }
}