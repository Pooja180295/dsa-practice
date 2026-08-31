//Missing number in an array
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5};
        int n = 5;
        int target = n*(n+1)/2;

        System.out.println("Total sum: " + target);
        int currentSum = 0;

        for(int i=0;i<nums.length;i++) {
            currentSum = currentSum + nums[i];
        }
        System.out.println(currentSum);

        int missingNumber = target - currentSum;
        System.out.println(missingNumber);

   }
}
