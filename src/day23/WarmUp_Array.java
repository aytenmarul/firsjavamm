package day23;

public class WarmUp_Array {

    public static void main(String[] args) {

int[]nums=new int[7];
nums[0]=11;
        nums[1]=2;
        nums[2]=23;
        nums[3]=4;
        nums[4]=53;
        nums[5]=6;
        nums[6]=3;
       //int[] nums2=new int[]{11,2,34,4,53,6,3};
        //int[] nums3=new int[]{11,2,34,4,53,6,3};

        for (int x = nums.length-1; x >= 0; x--) {
            System.out.println("item="+nums[x]);
        }
        int arraySize=nums.length;
        int lastItemIndex=arraySize-1;
        int lastItemValue=nums[lastItemIndex];

        System.out.println("last Item Value="+lastItemValue);
        int middleItemIndex=arraySize/2;
        System.out.println("middle item value ="+nums[middleItemIndex]);
        int sum=0;
        for (int x = 0; x <arraySize ; x++) {

            int currentItem=nums[x];
            sum=sum +currentItem;
        }
        System.out.println("sum="+sum);


    }
}