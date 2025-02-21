//https://www.geeksforgeeks.org/chocolate-distribution-problem/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr={7, 3, 2, 4, 9, 12, 56};
        System.out.println(minChocolateDifference(arr,5));
    }
    static int minChocolateDifference(int[] arr,int m){
        if(m==0||arr.length==0){
            return 0;
        }
        if (arr.length < m) {
            return -1;
        }
        Arrays.sort(arr);
        if (m == 1) {
            return 0;
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}
