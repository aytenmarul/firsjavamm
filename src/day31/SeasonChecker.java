package day31;

public class SeasonChecker {
    public static void main(String[] args) {

decideSeasonActinon("winter");
decideSeasonActinon("summer");
        decideSeasonActinon("spring");

        String myseason="aaa";
decideSeasonActinon(myseason);

    }
public static void decideSeasonActinon(String season){
    switch (season){
        case"spring":
            System.out.println("hiking");
            break;
        case"summer":
            System.out.println("swimmig");
            break;
        case" fall":
            System.out.println("shopping");
            break;
        case "winter":
            System.out.println("sking");
            break;
        default:
            System.out.println("invalid season");
    }
    }
}

