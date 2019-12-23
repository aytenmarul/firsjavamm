package officeHours;

public class ornek {
    public static void main(String[] args) {

        int x = 0;
        while (x < 5) {
            System.out.println("happy");
            x++;
        }
        for (int i = 0; i < 10; i++) {

           if (i % 2!= 0){
                continue;
            }
                System.out.println("even number" + i);
            }





            int [] intArray={1,2,4,5,7};

        for (int item : intArray) {


            System.out.println("number"+item);

        }

       String[] strArray={"dave","eva","mouse"};
        for (String item: strArray) {
            System.out.println("item "+item);
        }


    }
    }
