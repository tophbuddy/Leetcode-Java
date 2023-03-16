package Easy;

public class LeetCode_9_PalindromeNumber_Math {
    public boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0) return false;

        int n = 0, m = x;
        while (x != 0) {
            n = (x % 10) + (n * 10);
            x /= 10;
        }

        return n == m || n == m / 10;
    }
}
