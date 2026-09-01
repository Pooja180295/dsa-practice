//Second Largest Element in an array
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {10, 5, 20, 8, 20, 15};
        int n = nums.length;
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++) {
            if(nums[i]>highest) {
                secondHighest = highest;
                highest = nums[i];
            }
            if(nums[i]<highest && nums[i]>secondHighest) {
                secondHighest = nums[i];
            }
        }
        System.out.println(secondHighest);
    }
}
