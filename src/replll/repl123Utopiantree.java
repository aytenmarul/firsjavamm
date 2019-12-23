package replll;

public class repl123Utopiantree {
   // class Main {
        public static void main(String[] args) {
            int treeSize=0;
            for(int year=1; year<=3; year++){
                treeSize++;
                System.out.println("year"+year+"-"+"growth 1 cm");
                System.out.println("treeSize:"+treeSize+"cm");
            }
            for(int year=4; year<=10; year++){
                treeSize+=2;
                System.out.println("year"+year+ "-"+"growth 2cm");
                System.out.println("tree size:"+treeSize+"cm");
            }
        }
    }


  /*  int[] growth = {1 , 1 , 1 , 2 , 2 , 2 , 2 , 2 , 2 , 2};
int treeSize = 0;
for (int i = 0 ; i < growth.length ; i++){
System.out.println("year "+(i+1)+" - growth "+growth[i]+" cm");
treeSize += growth[i];
System.out.println("tree size: "+treeSize+"cm");
}

*/
