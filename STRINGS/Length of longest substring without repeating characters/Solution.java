//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
/* Using sliding window method */

import java.util.ArrayList;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        String str="abcdeabcbb";
        System.out.println(length(str));
    }
    static int length(String s){
        int start=0;
        int end=0;
        int max_length=0;
        List<Character> list = new ArrayList<Character>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
}