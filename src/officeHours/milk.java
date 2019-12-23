package officeHours;

public class milk {
    public static void main(String[] args) {
        String[] milk = {" whole", "soy", "oat", " almond"};
        String[] milkBrand = {"Dean's,", "Slik", "Datly", "Greenway"};
        String[] milkContens = {"fat", "protein", "fiber", "sugar"};
      /*  float[] caloriesFat = {8.0f, 4.5f, 7.0f, 2.5f};
        float[] caloriesProtein = {8.0f, 8.0f, 3.0f, 1.0f};
        float[] caloriesFiber = {0.0f, 2.0f, 3.0f, 0.99f};
        float[] caloriesSugar = {11.0f, 6.0f, 7.0f, 7.0f};
        for (String eachMilk : milk) {
            if (eachMilk.equalsIgnoreCase("whole")) {
                System.out.println(eachMilk + "milk is" + milkBrand[0] + "has" +
                        caloriesFat[0] + milkContens[0] + " , " + caloriesProtein[0] +
                        milkContens[1] + "," + caloriesSugar[0] + milkContens[3] + "," + caloriesFiber[0] +
                        milkContens[2]);
            }

*/
            String[][] milkAlternatives = {{"Whole Milk", "Dean's", "8g fat", "8g protein", "0g fiber", "11g sugar"},
                    {"Soy Milk", "Silk", "4.5g fat", "8g protein", "2g fiber", "6g sugar"},
                    {"Oat Milk", "Oatly", "7g fat", "3g protein", "3g fiber", "7g sugar"},
                    {"Almond Milk", "Greenway", "2.5g fat", "1g protein", "0.99g fiber", "7g sugar"}};

            for (int x = 0; x <= milkAlternatives.length - 1; x++) {
                System.out.println("\n");
                for (int y = 0; y < milkAlternatives[0].length; y++) {
                    System.out.print(milkAlternatives[x][y] + ", ");
                }

                System.out.println();
            }
        }
    }
