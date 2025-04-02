
import java.util.ArrayList;

public class printalternative{
    static ArrayList<Integer> print(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i+=2){
            res.add(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,3};
        ArrayList<Integer> res=print(arr);
        System.out.print(res);
    }
}