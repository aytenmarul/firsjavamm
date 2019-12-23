package day21;

public class wakeUp_NamePrint {
    public static void main(String[] args) {
        // write your code here

   String myName="My name is ayten tecim here";
int charCount=myName.length();
        System.out.println("charCount="+charCount);

int lastCharIndex=charCount-1;
        System.out.println("lastCharIndex="+lastCharIndex);
       // System.out.println(myName.substring(0,1));

        for (int x=0; x<=lastCharIndex; x++) {
            //System.out.println(myName.charAt(x)+"->");
            System.out.print(myName.substring(x,x+1)+"->");
        }
   
   
    }
}