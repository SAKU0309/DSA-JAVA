//https://www.naukri.com/code360/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=SUBMISSION

public class solution {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,3};
        System.out.println(largestElement(arr, 5));
    }

    static int largestElement(int[] arr, int n) {
       int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}