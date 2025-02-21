
public class Solution {
    public static void main(String[] args) {
        String str= "PROBLEM";
        char ch[]=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.println(ch[i]);
        }
        System.out.println(reverse(str));
    }
    static StringBuilder reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse();
    }    
}
