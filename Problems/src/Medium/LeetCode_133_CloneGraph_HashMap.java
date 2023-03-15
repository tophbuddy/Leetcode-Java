package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_133_CloneGraph_HashMap {

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    Map<Node, Node> map;

    public Node cloneGraph(Node node) {
        map = new HashMap<>();
        return dfs(node);
    }

    public Node dfs(Node old) {
        if (old == null) return null;
        if (map.containsKey(old)) {
            return map.get(old);
        }

        Node copy = new Node(old.val);
        map.put(old, copy);
        for (Node node : old.neighbors) {
            copy.neighbors.add(dfs(node));
        }

        return copy;
    }
}
