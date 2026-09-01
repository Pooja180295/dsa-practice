//Merge Two Sorted Arrays - O(n+m)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};
        int n1 = nums1.length;
        int n2 = nums2.length;
        int resultArr[] = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2) {
            if(nums1[i]<nums2[j]) {
                resultArr[k] = nums1[i];
                i++;
                k++;
            } else {
                resultArr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<n1) {
            resultArr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n2) {
            resultArr[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(resultArr));
    }
}
