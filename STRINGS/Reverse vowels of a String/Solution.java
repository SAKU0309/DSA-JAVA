//https://leetcode.com/problems/reverse-vowels-of-a-string/

public class Solution {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseVowel(str));
    }
    public static String reverseVowel(String s){
        char ch[]=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!isVowel(ch[start])){
                start++;
            }else if(!isVowel(ch[end])){
                end--;
            }else{
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
