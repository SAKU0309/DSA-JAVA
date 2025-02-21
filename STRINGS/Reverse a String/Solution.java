
public class Solution {
    public static void main(String[] args) {
        String str= "PROBLEM";
        char ch[]=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.println(ch[i]);
        }
        System.out.println(reverse(str));
    }
    static StringBuffer reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse();
    }    
}
