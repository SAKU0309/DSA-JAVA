import java.util.Arrays;

public class Solution {
    static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        if(k==0) return;
        int i=k,j=n-k;
        while(i!=j){
            if(i<j){
                swap(arr,k-i,k-i+j,i);
                j-=i;
            }else{
                swap(arr,k-i,k,j);
                i-=j;
            }
        }
        swap(arr,k-i,k,i);
    }
    static void swap(int[] arr,int start1,int start2, int d){
        for (int i = 0; i < d; i++) {
            int temp = arr[start1 + i];
            arr[start1 + i] = arr[start2 + i];
            arr[start2 + i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int k1 = 2;
        rotate(arr1, k1);
        System.out.println(Arrays.toString(arr1)); 

        int arr2[] = {1, 2, 3, 4, 5, 6, 7};
        int k2 = 3;
        rotate(arr2, k2);
        System.out.println(Arrays.toString(arr2));
    }
}
