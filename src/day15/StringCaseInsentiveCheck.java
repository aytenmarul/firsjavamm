package day15;

public class StringCaseInsentiveCheck {

    public static void main(String[] args) {


        String name=" arya stark";
        System.out.println("name contains st result is: "+name.contains("ST"));
String uppercaseName=name.toUpperCase();
        System.out.println("upperCaseName contains ST or not?"+uppercaseName.contains("ST"));

        String lowerCaseName=name.toLowerCase();
        System.out.println("LowerCaseName contains st or not?"+ lowerCaseName.contains("st"));



    }
}