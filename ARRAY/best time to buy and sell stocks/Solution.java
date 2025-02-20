

public class Solution {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices){
        int minprice=Integer.MAX_VALUE;
       int maxprofit=0;
       for(int price: prices){
        minprice = Math.min(minprice,price);
        maxprofit = Math.max(maxprofit,price-minprice);
       }
       return maxprofit;
    }
}
