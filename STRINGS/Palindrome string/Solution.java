public class Solution {
    public static void main(String[] args) {
        String str="malayalam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
}
