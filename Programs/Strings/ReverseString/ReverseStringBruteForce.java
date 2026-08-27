//Reverse String - Brute Force
class Main {
    public static void main(String[] args) {
        String str = "Pooja";
        String reverse = "";
        String reverseSb = "";
        int n = str.length();
        reverse = reverseString(str, n, reverse);
        System.out.println(reverse);
    }

    public static String reverseString(String str, int n, String reverse){
        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }
}
