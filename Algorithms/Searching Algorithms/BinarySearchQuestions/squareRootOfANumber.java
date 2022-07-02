package BinarySearchQuestions;
/*
 Leetcode Question Link - https://leetcode.com/problems/sqrtx/submissions/
 */
public class squareRootOfANumber {
    static int ans = -1;

    public static int squareRoot(int n) {
        int s = 0;
        int e = n;
        int mid = s + (e-s)/2;

        while(s<=e) {
            long square = (long) mid * mid;
            if(square == n) {
                return mid;
            }
            if(square > n) {
                e = mid -1;
            } else {
                ans = mid;
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareRoot(49));
    }
}
