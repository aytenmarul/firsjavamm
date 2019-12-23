package mentoringClass;

public class Sumeyyenumbers {
    public static void main(String[] args) {
        int [] numbers = {4, 18, 20, 15, 35, 70};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum=" + sum);
        //create an int array of 6 elements and find out
        //int[] numbers2 = new int[6];
        //int[] numbers1 = new int[]{4, 18, 20, 15, 35, 70};
        int average = (sum / numbers.length);
        System.out.println("average=" + average);

        int sumEven = 0;
        int countEven=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
                sumEven += numbers[i];
            }
        }
        System.out.println("countEven="+countEven);
        System.out.println("sumEven=" + sumEven);


//        sum of odd numbers in the array
        int sumOdd = 0;
        int countOfOdd = 0;
        for(int i=0; i < numbers.length ;i++){
            if(numbers[i]%2 != 0){
                countOfOdd++ ;
                sumOdd += numbers[i];
            }
        }
        System.out.println("countOfOdd = " + countOfOdd);
        System.out.println("sumOdd = " + sumOdd);
//        max number in the array
//        min number in the array

    }
}
