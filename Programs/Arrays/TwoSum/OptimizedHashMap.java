//Two Sum - HashMap
//Time: O(n), Space: O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int first = nums[i];
            int second = target - first;
            if(map.containsKey(second)) {
                System.out.println(first + " " + second);
                return;
            }
            map.put(first, i); //Store the current number as the key and its index as the value.
        }
   }
}
