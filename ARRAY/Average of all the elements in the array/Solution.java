public class Solution {
    static int average(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            count+=arr[i];
        }
        return count/(n);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.print(average(arr));
    }
}
