package day27;

public class ArrayTask02 {
    public static void main(String[] args) {
int [] nums={100,10000,999,888,121,4};
int max=nums[0];
for(int i=0; i<nums.length; i++){
    if (max<nums[i]){
        max=nums[i];
    }
}
        System.out.println(max);
////usteki gibi veya alltaki gibi max numberi bulabiliriz second max yazdigina bakma
int secondMax=nums[0];
for(int i =0; i<nums.length; i++){
    if(secondMax<nums[i]&& secondMax!=max){
secondMax=nums[i];
    }
}
        System.out.println("second max number:"+secondMax);

    }
}