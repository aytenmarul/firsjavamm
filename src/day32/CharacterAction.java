package day32;

public class CharacterAction {
    public static void main(String[] args) {
         printAtoZ();
        printZtoA();
        printAlphabet('a', 'b');
        printAlphabet('G', 'B');
        printAlphabet('A', 'A');
        printAlphabet('a', 'A');
        printAlphabet('Z', 'a');


    }

    public static void printAlphabet(char beginning, char ending) {

        if (beginning < ending) {
            System.out.println("we need increment");
            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.println(iChar + " ");
            }
            System.out.println();
        } else if (beginning > ending) {

            System.out.println("we need to decrement");

        //System.out.println();
        for (char iChar = beginning; iChar >= ending; iChar++) {
            System.out.print(iChar + " ");
        }
        System.out.println();

    }else

    {
        System.out.println("they are same character");
    }

}









public static void printAtoZ(){
  for (char iChar='A';iChar<='Z'; iChar++){
      System.out.print(iChar+" ");
  }
    System.out.println();

}

public static void printZtoA(){
    for (char iChar='Z'; iChar>='A'; iChar--) {
        System.out.print(iChar+ " ");
    }
    System.out.println();
}








}
