public class Solution {     
    static int[] reverse(int[] arr) {         
        int start = 0; 
        int end = arr.length - 1; 
        while (start < end) {             
            int temp = arr[start];             
            arr[start] = arr[end];             
            arr[end] = temp;             
            start++;             
            end--;         
        }         
        return arr;     
    }     

    public static void main(String[] args) {         
        int[] arr = {4, 6, 8, 9, 2};         
        reverse(arr); 
        for (int num : arr) {             
            System.out.print(num + " ");         
        }     
    } 
}
