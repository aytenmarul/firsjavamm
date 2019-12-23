package day17;

public class AryaStark {

    public static void main(String[] args) {


        String fullName = "aYTen teciM";

        int indexOfSpace = fullName.indexOf(" ");

        fullName =
                fullName.substring(0, indexOfSpace).toUpperCase().substring(0, 1) +  // ARYA -->> A
                        fullName.substring(0, indexOfSpace).toLowerCase().substring(1) +" "+
                        fullName.substring(indexOfSpace + 1).toUpperCase().substring(0,1) +
                        fullName.substring(indexOfSpace + 1).toLowerCase().substring(1);

        System.out.println("fullName = " + fullName);

    }
}
