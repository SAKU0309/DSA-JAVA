public class Solution {
    static int secondlargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlarge=largest;
                largest=arr[i];
            }else if (arr[i] > secondlarge && arr[i] != largest)
            {
                secondlarge = arr[i];
            }
        }
        return secondlarge;
    }
    static int second(int[] arr){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }else if(arr[i]<second && arr[i]!=first){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr={4,6,8,9,2,5,11,68,44,23,1};
        System.out.println(second(arr));
        System.err.println(secondlargest(arr));
    }
}
