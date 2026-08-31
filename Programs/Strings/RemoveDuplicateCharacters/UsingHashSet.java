//Remove Duplicates from a String - hashSet
//Time: O(n) average, Space: O(n).
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "programming";
        HashSet<Character> set = new HashSet<>();
        int len = str.length();
        StringBuilder result = new StringBuilder();
        for(int i =0;i<len;i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println(result);
   }
}
