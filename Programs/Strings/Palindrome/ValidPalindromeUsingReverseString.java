//Valid Palindrome - Reverse String - StringBuilder
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "iti";
        int n = str.length();
        StringBuilder reverseNew = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            reverseNew.append(str.charAt(i));
        }
        System.out.println(reverseNew);
        if(str.contentEquals(reverseNew)) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
   }
}
