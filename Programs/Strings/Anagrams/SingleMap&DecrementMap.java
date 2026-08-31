//Valid Anagrams - single map - Substraction from original map
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "tac";
        int len1 = s1.length();
        int len2 = s2.length();
        HashMap<Character, Integer> map = new HashMap<>();
        if (len1 != len2) {
        System.out.println("Not a Valid Anagram");
        return;
}
        for(int i=0;i<len1;i++){
            char ch1 = s1.charAt(i);
            if(map.containsKey(ch1)) {
                map.put(ch1, map.get(ch1)+1);
            } else {
                map.put(ch1, 1);
            }
        }
        System.out.println(map);
        for(int i=0;i<len2;i++){
            char ch2 = s2.charAt(i);
            if(map.containsKey(ch2)) {
                map.put(ch2, map.get(ch2)-1);
            } else {
                System.out.println("Not a Valid Anagram");
                return;
            }
        }
        for(int count : map.values()) {
            if(count!=0){
                System.out.println("Not a valid anagram");
                return;
            }
        }
        System.out.println("valid anagram");
   }
}
