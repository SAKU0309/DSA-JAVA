//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class Solution {
    public static void main(String[] args) {
        System.err.println(occurrence("sadbutsad", "sad"));
    }
    static int occurrence(String haystack, String needle){
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<n-m+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
