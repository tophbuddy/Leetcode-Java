package Medium;

import java.util.*;

public class LeetCode_253_MeetingRooms_PQ {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 1) return 1;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= pq.peek()[1]) {
                pq.poll();
            }
            pq.offer(intervals[i]);
        }
        return pq.size();
    }
}
