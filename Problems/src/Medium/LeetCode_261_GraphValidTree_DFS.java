package Medium;

import java.util.*;

public class LeetCode_261_GraphValidTree_DFS {
    Map<Integer, List<Integer>> adjMap = new HashMap<>();

    public boolean validTree(int n, int[][] edges) {
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < n; i++) {
            adjMap.put(i, new ArrayList<Integer>());
        }
        for (int[] edge : edges) {
            adjMap.get(edge[0]).add(edge[1]);
            adjMap.get(edge[1]).add(edge[0]);
        }

        return dfs(0, -1, visited) && visited.size() == n;
    }

    private boolean dfs(int node, int prev, Set<Integer> visit) {
        if (visit.contains(node)) return false;
        visit.add(node);
        for (int val : adjMap.get(node)) {
            if (val == prev) continue;
            if (!(dfs(val, node, visit))) return false;
        }
        return true;
    }
}
