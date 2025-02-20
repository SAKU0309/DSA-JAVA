public class Solution {
    public static void main(String[] args) {
        String str="Hello my name is Sakshi";
        System.out.println(counts(str));
    }
    static int counts(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !=' '){
                count++;
            }
        }
        return count;
    }
}
