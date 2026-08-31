//Valid Palindrome
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "madam";
        char arr[] = str.toCharArray();
        int len = str.length();
        int left = 0;
        int right = len-1;
        boolean palindrome = true;
        while(left<right){
            if(arr[left]!=arr[right]) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(palindrome) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
   }
}
