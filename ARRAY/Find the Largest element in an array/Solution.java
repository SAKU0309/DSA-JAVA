public class Solution {
    static int largest(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,9,6,4,5,7,11,25,3,8};
        System.err.println(largest(arr));
    }
}
