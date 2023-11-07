public class OperatoriLogici {
    public static void main(String[] args) {
   
    int sum = 0;
    int[] nums=new int[] {27, 32, 15, 4, 0};
    for (int i = 0; i < nums.length; i++) {
     sum += nums[i];
    }
    System.out.println(sum);

    boolean found=false;
    int target=4;



System.out.println(found);
int repeated = 1;
nums[1] = 9;
for (int i = 0; 1 < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[1] == nums[j]) {
            repeated++;
        }
    }
    if (repeated > 1) {
        break;
    }
}       
System.out.println(repeated);
int mode = -1;
int pose = -1;
int howMany = 1;
int value = -1;
for (int i = 0; i < nums.length; i++) {
     for (int j = i + 1; j < nums.length; j++) {
          if (nums[i] == nums[j]) {
              howMany++;
          } 
     }
     if (howMany > mode) {
        mode = howMany;
        pose = i;
        value = nums[1];
     }
}
System.out.println(mode + " " + pose + " " + nums[pose] + " " + value);
    }
}