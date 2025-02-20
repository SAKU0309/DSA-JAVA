//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class Solution {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,4));
    }
    static int search(int[] arr, int target){
        int left =0;
        int right= arr.length-1;
        while(left<=right){
            int mid= left +(right-left)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[left]<=arr[mid]){
                if(arr[left] <= target && target <= arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            else{
                if(arr[mid] < target && target <= arr[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
