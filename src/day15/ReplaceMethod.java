package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

String message="I love pumkin,pumkin is fun";

message=message.replace("pumkin","java!");

        System.out.println(message);
        System.out.println(message);
String message2="happy thanksgiving all";

        message2=message2.replace("thanksgiving","thanks giving");
        System.out.println("message2= " +message2);


        message2=message2.replace(" ","");
        System.out.println("message2= " +message2);

        String message3 = "TOMORROW IS OFF NO!";
        // how do we remove  NO!
        System.out.println(message3.replace(" NO", ""));






    }


}