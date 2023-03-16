package Medium;

import java.util.*;

public class LeetCode_435_NonOverlappingIntervals_DPSorting {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1, max = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= max) {
                count++;
                max = intervals[i][1];
            }
        }
        return intervals.length - count;
    }
}
