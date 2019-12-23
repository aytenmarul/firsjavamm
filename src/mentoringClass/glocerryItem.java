package mentoringClass;

public class glocerryItem {
    public static void main(String[] args) {

        String[] groseryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kivi"};
        for (int i = 0; i < groseryItems.length; i++) {
            System.out.print(groseryItems[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < groseryItems.length; i++) {
            if (i % 2 != 0) {
                System.out.print(groseryItems[i] + " ");
            }
        }
        System.out.println();
        for (int i = groseryItems.length - 1; i >= 0; i--) {
            System.out.print(groseryItems[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < groseryItems.length; i++) {
            if (groseryItems[i].equals("strawberry")) {
            System.out.println("i=" + i);
        }
    }
    System.out.println();
int countOfBerry=0;
for(int i=0; i<groseryItems.length; i++){
    if(groseryItems[i].contains("berry")) {
        //System.out.println(groseryItems);
        countOfBerry++;
    }
}
        System.out.println("count of berry="+countOfBerry);

    }
}
