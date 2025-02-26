//https://leetcode.com/problems/single-number/description/

public class Solution {
    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    static int singleNumber(int[] nums){
        int unique=0;
        for(int num: nums){
            unique^=num;
        }
        return unique;
    }
}
