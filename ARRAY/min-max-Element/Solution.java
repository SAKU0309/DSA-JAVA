//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

public class Solution {
    public static void main(String[] args) {
        int[] arr={3,4,7,9,1,2,6};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
}
