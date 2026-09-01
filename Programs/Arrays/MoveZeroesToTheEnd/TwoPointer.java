//Move zeroes to the right
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 0, 4, 5, 6};
        int n = arr.length;
        int i = 0;
        for(int j = 0; j<n;j++){
            if(arr[j]!=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
