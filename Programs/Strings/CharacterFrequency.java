//Character frequency using HashMap
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "aaabbbccddeff";
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
        //Why String Builder - as to append we will use couple of steps and every time with String there will be new object created. So SB will allow us to update the same object
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            result.append(entry.getKey());
            result.append(entry.getValue());
        }
        System.out.println(result);
   }
}
