//Second Largest Element in an array
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {10, 5, 20, 8, 20, 15};
        int n = nums.length;
        Arrays.sort(nums);
        int largest = nums[n-1];
        for(int i=n-2;i>=0;i--) {
            if(nums[i]!=largest) {
                System.out.println("Largest:" + largest);
                System.out.println("Second Largest:" + nums[i]);
                break;
            }
        }
    }
}
