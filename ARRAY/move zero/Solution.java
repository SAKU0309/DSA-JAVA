//https://leetcode.com/problems/move-zeroes/description/
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        movezero(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void movezero(int[] arr){
        int index=0;
        for(int num : arr){
            if(num!=0){
                arr[index++]=num;
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
    }
}
