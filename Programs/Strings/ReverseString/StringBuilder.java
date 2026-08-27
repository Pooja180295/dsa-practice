//Reverse String - Brute Force
class Main {
    public static void main(String[] args) {
        String str = "Pooja";
        String reverse = "";
        int n = str.length();
        StringBuilder sb = new StringBuilder(str);
        for(int i = n-1;i>=0;i--){
            char ch = sb.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
    }
}
