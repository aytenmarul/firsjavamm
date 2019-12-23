package day20;

public class polinderomTest {
    public static void main(String[] args) {
        // write your code here
//if it doesnt change;
        String name = "kayak";
        System.out.println("name="+name);
        String reversedName = "";
        for (int x = name.length() - 1; x >= 0; x--) {
            reversedName = reversedName + name.charAt(x);
        }

        System.out.println("reversedName=" + reversedName);

        if (name.equalsIgnoreCase(reversedName)) {
            System.out.println("palindorem test pasted");
        } else {
            System.out.println("polindroemn test has failed");
        }
    }

}


