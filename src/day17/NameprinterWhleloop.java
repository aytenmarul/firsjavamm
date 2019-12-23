package day17;

public class NameprinterWhleloop {
    public static void main(String[] args) {

String name ="Alexander";
int x=0;

while (x<name.length()) {

    System.out.print("index"+x+":");
    System.out.println(name.charAt(x));
    ++x;

}
    }
}
