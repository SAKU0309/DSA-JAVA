//https://leetcode.com/problems/maximum-subarray/

public class Solution {
    public static int maxSubArray(int[] arr){
            int currentsum= arr[0];
            int maxsum = arr[0];
            for(int i =1; i<arr.length;i++){
                currentsum=Math.max(arr[i], currentsum+arr[i]);
                maxsum=Math.max(maxsum, currentsum);
            }
            return maxsum;
        }
    public static void main(String[] args) {
            int[] arr = {2,4,6,3,8,1};
            System.out.println(maxSubArray(arr));
    }
}
