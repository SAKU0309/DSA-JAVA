
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};     
        System.out.println(Arrays.toString(reversearray(arr)));
    }
    static int[] reversearray(int[] arr){
        int n= arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-i-1] = temp;
        }
        return arr;
    }
}
