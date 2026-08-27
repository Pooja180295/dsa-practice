//Reverse String - Two Pointers
class Main {
    public static void main(String[] args) {
        String str = "Pooja";
        char[] ch = str.toCharArray();
        int n = str.length();
        int left = 0;
        int right = n-1;
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String reverse = new String(ch);
        System.out.println(reverse);
    }
}
