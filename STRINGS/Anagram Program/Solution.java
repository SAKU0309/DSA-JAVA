import java.util.Arrays;

/*
 * Anagrams are string having same character with the same frequencies
 * Eg. Keep={k:1;e:2;p:1}, peek={k:1;e:2,p:1} . Since both have same frequence character therefore they are Anagrams.
 */

public class Solution {
    public static void main(String[] args) {
        String str1="keep";
        String str2="peke";
        System.out.println(isAnagrams(str1, str2));
    }
    static boolean isAnagrams(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1,ch2);
        }
    } 
}
