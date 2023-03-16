package Easy;

import java.util.*;

public class LeetCode_412_FizzBuzz_Math {
    public List<String> fizzBuzz(int n) {
        if (n == 1) return new ArrayList<String>(List.of("1"));

        List<String> res = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            res.add(String.valueOf(i));
        }

        if (n >= 3) {
            int i = 1;
            while (i * 3 <= n) {
                res.set((i * 3) - 1, "Fizz");
                i++;
            }
        }
        if ( n >= 5) {
            int i = 1;
            while (i * 5 <= n) {
                res.set((i * 5) - 1, "Buzz");
                i++;
            }
        }
        if ( n >= 15) {
            int i = 1;
            while (i * 15 <= n) {
                res.set((i * 15) - 1, "FizzBuzz");
                i++;
            }
        }

        return res;
    }
}
