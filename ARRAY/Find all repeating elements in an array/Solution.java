public class Solution {
    static void repeat(int[] arr){
        int count=0;
	    int[] dup = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dup[count++]=arr[i];
                }
            }
        } 
        for(int i=0;i<count;i++){
	        if(dup[i] != dup[i+1]) 
            {
                System.out.print(dup[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,2,2,3,4,4,5,6,7,7,7,8,3};
        repeat(arr);
    }
}
