import java.util.HashSet;

public class Solution {
    static int remove(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (!seen.contains(arr[j])) { 
                seen.add(arr[j]);  
                arr[i] = arr[j];   
                i++; 
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,9,3,1,3,9};
        int k = remove(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
