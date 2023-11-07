public class Array {
    public static void main(String[] args) {

     int x=5;
     int[] nums = new int[5];
     //System.out.println(nums[nums.length-1]);
     nums[0]=27;
     nums[nums.length-1]=30;
        System.out.println(nums[nums.length-1]);
     for(int i=0; i<nums.length; i++) {
        System.out.print(nums[i]);

        for(int i=0; i<nums.length; i++) {
            nums[i]=i;
            System.out.print(nums[i]);
        }
     } 
    }
 
}