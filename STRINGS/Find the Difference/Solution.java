//https://leetcode.com/problems/find-the-difference/
/*  XOR operation
 *      x ^ x = 0
 *      x ^ 0 = x
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abc", "abcd"));
    }
    public static char findTheDifference(String s, String t) {
        int xor = 0;
        for (char c : s.toCharArray()) {
            xor ^= c;
        }
        for (char c : t.toCharArray()) {
            xor ^= c;
        }
        return (char) xor;
    }
}
