
import java.util.Arrays;


public class Solution {
    static int[] product(int[] arr){
        int n=arr.length;
        int[] result = new int[n];
        for(int i=0;i<arr.length;i++){
            int product = 1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product *= arr[j];
                }
            }
            result[i]=product;
        }
        return result; 
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,6};
        System.out.print(Arrays.toString(product(arr)));
    }
}
