import java.util.*;

class Solution {

    public int[][] merge(int[][] intervals) {

        // Sort intervals by starting value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        // First interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // Overlapping intervals
            if (intervals[i][0] <= end) {

                end = Math.max(end, intervals[i][1]);

            } else {

                // No overlap, store previous interval
                ans.add(new int[]{start, end});

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Add the last interval
        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}