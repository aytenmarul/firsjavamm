package day30;

public class carInventory {
    public static void main(String[] args) {

        String[] cars = {"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        //  Create a class called CarInventory with main
// count how many Chevrolet is in this array
// and how many civic you have
        int chevyCNT = 0;
        int civicCNT = 0;
        for (String eachCar : cars) {

            if (eachCar.startsWith("Chevrolet")) {

                chevyCNT++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")) {
                civicCNT++;
            }
        }

            System.out.println("chevyCNT=" + chevyCNT);
        System.out.println("cyevyCNT="+civicCNT);
    }

    }
