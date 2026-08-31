//Valid Anagrams
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "tac";
        int len1 = s1.length();
        int len2 = s2.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (len1 != len2) {
        System.out.println("Not a Valid Anagram");
        return;
}
        for(int i=0;i<len1;i++){
            char ch1 = s1.charAt(i);
            if(map1.containsKey(ch1)) {
                map1.put(ch1, map1.get(ch1)+1);
            } else {
                map1.put(ch1, 1);
            }
        }
        System.out.println(map1);
        for(int i=0;i<len2;i++){
            char ch2 = s2.charAt(i);
            if(map2.containsKey(ch2)) {
                map2.put(ch2, map2.get(ch2)+1);
            } else {
                map2.put(ch2, 1);
            }
        }
        System.out.println(map2);
        if(map1.equals(map2)){
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Not a Valid Anagram");
        }
   }
}
