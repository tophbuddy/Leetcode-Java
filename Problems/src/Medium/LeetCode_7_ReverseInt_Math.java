package Medium;

public class LeetCode_7_ReverseInt_Math {
    public int reverse(int x) {
        if (x < 10 && x > -10) return x;

        int n = 0, prev = 0;
        while (x != 0) {
            n = (x % 10) + (n * 10);
            if ((n - x % 10) / 10 != prev) return 0;
            x /= 10;
            prev = n;
        }

        return n;
    }
}
