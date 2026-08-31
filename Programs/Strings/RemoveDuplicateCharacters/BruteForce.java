//Remove Duplicates from a String - hashSet
//Time: O(n2) average, Space: O(n).
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "programming";
        int len = str.length();
        StringBuilder result = new StringBuilder();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            Boolean duplicate = false;
            for(int j =0;j<result.length();j++){
                if(result.charAt(j)==ch){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                result.append(ch);
            }
        }
        System.out.println(result);
   }
}
