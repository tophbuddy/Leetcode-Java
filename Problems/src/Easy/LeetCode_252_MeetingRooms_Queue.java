package Easy;

import java.util.*;

public class LeetCode_252_MeetingRooms_Queue {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length <= 1) return true;

        Arrays.sort(intervals, (x,y) -> Integer.compare(x[0], y[0]));

        if (intervals.length == 2 && intervals[0][1] <= intervals[1][0]) {
            return true;
        }

        Queue<int[]> q = new LinkedList<int[]>();
        for (int[] interval : intervals) {
            if (!q.isEmpty()) {
                if (q.peek()[1] <= interval[0]) {
                    q.poll();
                    q.add(interval);
                } else {
                    return false;
                }
            } else {
                q.add(interval);
            }
        }

        return q.size() < 2;
    }
}
