//First non-repeating character
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "aaabbbcddeff";
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        for(int i=0;i<n;i++) {
            char ch = str.charAt(i);
            if(map.get(ch)==1){
                System.out.println("Found: " + ch);
                return;
            }
        }
   }
}
