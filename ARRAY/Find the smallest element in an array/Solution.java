public class Solution {
    static int samllest(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,9};
        System.err.println(samllest(arr));
    }
}
