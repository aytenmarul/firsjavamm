package mentoringClass;

public class parvinMilk {
    public static void main(String[] args) {
        String[][] milkAlternatives = {{"Whole Milk", "Dean's", "8g fat", "8g protein", "0g fiber", "11g sugar"},
                {"Soy Milk", "Silk", "4.5g fat", "8g protein", "2g fiber", "6g sugar"},
                {"Oat Milk", "Oatly", "7g fat", "3g protein", "3g fiber", "7g sugar"},
                {"Almond Milk", "Greenway", "2.5g fat", "1g protein", "0.99g fiber",
                        "7g sugar"}};


        for (int x = 0; x <= milkAlternatives.length - 1; x++) {
            System.out.println("\n");
            for (int y = 0; y < milkAlternatives[0].length; y++) {
                System.out.print(milkAlternatives[x][y] + ", ");
            }
        }
        System.out.println();




        for (int x=0; x <= milkAlternatives.length-1; x++) {
            System.out.println("\n");
            for(int y=0; y < milkAlternatives[0].length; y++) {
                System.out.print(milkAlternatives[x][y] + ", ");
            }
        }
        System.out.println();
    }
}
