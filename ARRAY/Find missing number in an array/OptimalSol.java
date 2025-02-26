//https://leetcode.com/problems/missing-number/
public class OptimalSol {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        System.err.println(search(arr, 6));
    }
    static int search(int[] arr,int n){
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for(int val : arr){
            actualSum += val;
        }
        return expectedSum-actualSum;
    }
}
