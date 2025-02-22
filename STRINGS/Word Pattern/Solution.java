
import java.util.HashMap;

//https://leetcode.com/problems/word-pattern/
public class Solution {
    public static void main(String[] args) {
        String pattern = "abaa";
        String s = "dog cat dog dog";
        System.out.println(wordpattern(pattern, s));
    }
    public static boolean wordpattern(String pattern,String s){
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> hm = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch= pattern.charAt(i);
            boolean conatinkey = hm.containsKey(ch);
            if(hm.containsValue(arr[i]) && !conatinkey){
                return false;
            }
            if(conatinkey && !hm.get(ch).equals(arr[i])){
                return false;
            }
            else{
                hm.put(ch, arr[i]);
            }
        }
        return true;
    }
}
