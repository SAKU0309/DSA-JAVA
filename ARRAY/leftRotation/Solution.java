//https://www.naukri.com/code360/problems/left-rotate-an-array-by-one_5026278?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=SUBMISSION

import java.util.Arrays;
public class Solution {
    static int[] rotateArray(int[] arr, int n) {
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(rotateArray(arr, 5)));
    }
}
