
import java.util.Arrays;

public class Solution{
    static double median(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2!=0){
            return arr[n/2];
        }
        else{
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        System.out.println(median(arr));
        int[] arr1={2,5,1,7};
        System.out.print(median(arr1));
    }
}