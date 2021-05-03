package com.raphael.lc.p133;

import java.util.*;

/**
 * @author Raphael
 * @date 2021-05-03 13:54:26
 */

class Node {
    public int val;
    public List<Node> neighbors;

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return val == node.val && Objects.equals(neighbors, node.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, neighbors);
    }
}

@SuppressWarnings("unused")
class CloneGraph {
    /**
     * Description for CloneGraph:
     * 克隆图
     */

    Map<Node, Node> visited = new HashMap<>(16);

    public Node cloneGraph(Node node) {
        // code
        if (node == null) {
            return null;
        }

        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node ans = new Node(node.val);
        visited.put(node, ans);

        for (Node subNode : node.neighbors) {
            ans.neighbors.add(cloneGraph(subNode));
        }

        return ans;
    }
}
