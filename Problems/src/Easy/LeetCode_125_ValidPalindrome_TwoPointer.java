package Easy;

public class LeetCode_125_ValidPalindrome_TwoPointer {
    public boolean isPalindrome(String s) {
        if (s.length() == 1 && !Character.isLetterOrDigit(s.charAt(0))) return true;
        s = s.toLowerCase();
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (Character.isLetterOrDigit(s.charAt(l)) && Character.isLetterOrDigit(s.charAt(r))) {
                if (s.charAt(l) == s.charAt(r)) {
                    r--;
                    l++;
                } else {
                    return false;
                }
            } else {
                if (!Character.isLetterOrDigit(s.charAt(l))) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return true;
    }
}
