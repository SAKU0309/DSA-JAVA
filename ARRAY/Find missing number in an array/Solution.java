
public class Solution {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int res = search(arr);
        System.out.println(res);

    }
    static int search(int[] arr){
        for(int i=1;i<=arr.length+1;i++){
            boolean found = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
}
