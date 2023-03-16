package Medium;

import java.util.*;

public class LeetCode_323_NumConnectedComponents_DFS {
    Map<Integer, List<Integer>> adjMap = new HashMap<>();
    Set<Integer> visited = new HashSet<>();

    public int countComponents(int n, int[][] edges) {

        for (int i = 0; i < n; i++) {
            adjMap.put(i, new ArrayList<Integer>());
        }
        for (int[] edge : edges) {
            adjMap.get(edge[0]).add(edge[1]);
            adjMap.get(edge[1]).add(edge[0]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!(visited.contains(i))) {
                count++;
                dfs(i);
            }
        }
        return count;
    }

    private void dfs(int node) {
        visited.add(node);
        for (int n : adjMap.get(node)) {
            if (visited.contains(n)) continue;
            dfs(n);
        }
    }
}
