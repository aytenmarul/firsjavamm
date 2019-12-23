package day16;

public class SecondWord {
    public static void main(String[] args) {



  String sentence="I love java";
  String secondWord;
  int firstSpaceIndex=sentence.indexOf(" ");
  System.out.println("firstSpaceIndex="+firstSpaceIndex);

  int lastSpaceIndex=sentence.lastIndexOf("");
        System.out.println("lastSpaceIndex="+lastSpaceIndex);

        //System.out.println(sentence.substring(2,6));
        System.out.println(sentence.substring(1+1,6));
        secondWord=sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
        System.out.println("secondWord="+secondWord);


    }
}