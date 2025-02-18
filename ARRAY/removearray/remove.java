package ARRAY.removearray;

public class remove {
    public static void main(String[] args) {
        int[] arr={1,1,3,7,7,5,8,9};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums) {
            if (nums.length==00)
                return 0;
            int i=1;
            for (int j=1;j<nums.length;j++){
                if(nums[j]!=nums[i-1]){
                    nums[i]=nums[j];
                    i++;
                }
            }
        return i;
    }
}
