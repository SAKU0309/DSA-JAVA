//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static List< Integer > sortedArray(int []a, int []b){
        Set<Integer> set = new HashSet<>();
        for(int num : a) {
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,3,4,6,7,8};
        System.out.println(sortedArray(a, b));
    }
}
