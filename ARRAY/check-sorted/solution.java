//https://www.naukri.com/code360/problems/ninja-and-the-sorted-check_6581957?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=PROBLEM

public class solution {
    public static int isSorted(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0; 
            }
        }
        return 1; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(isSorted(5, arr1)); 

        int[] arr2 = {0, 0, 0, 1};
        System.out.println(isSorted(4, arr2)); 

        int[] arr3 = {4, 5, 4, 4, 4};
        System.out.println(isSorted(5, arr3)); 
    }
}

