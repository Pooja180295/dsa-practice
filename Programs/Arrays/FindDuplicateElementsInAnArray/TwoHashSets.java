//Find Duplicate Elements in an Array - 2HashSets
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 4, 5, 3};
        int n = nums.length;
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        Boolean foundDuplicates = false;
        for(int i=0;i<n;i++){
            if(seen.contains(nums[i])){
                foundDuplicates = true;
                duplicates.add(nums[i]);
            }
            seen.add(nums[i]);
        }
        if(foundDuplicates){
            System.out.println("Here are Duplicates:" +duplicates);
        } else {
            System.out.println("There are no duplicates");
        }
   }
}
