//https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
import java.util.*;
public class Solution {
    public static int[] findSecondLargestSmallest(int n, int[] arr) {
        if (n < 2) return new int[]{-1, -1}; 

        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        return new int[]{secondLargest, secondSmallest};
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(findSecondLargestSmallest(5, arr1))); 
        int[] arr2 = {3, 4, 5, 2};
        System.out.println(Arrays.toString(findSecondLargestSmallest(4, arr2))); 
        int[] arr3 = {4};
        System.out.println(Arrays.toString(findSecondLargestSmallest(1, arr3))); 
    }
}
