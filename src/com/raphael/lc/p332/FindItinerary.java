package com.raphael.lc.p332;

import java.util.*;

/**
 * @author Raphael
 * @date 2021-05-05 13:39:42
 */
class FindItinerary {
    /**
     * Description for FindItinerary:
     * 重新安排行程
     */

    Map<String, List<String>> graph;
    Map<String, Set<Integer>> used;
    int n;

    private boolean dfs(List<String> ans) {
        if (ans.size() == n) {
            return true;
        }

        String cur = ans.get(ans.size() - 1);

        if (!graph.containsKey(cur)) {
            return false;
        }

        for (int i = 0; i < graph.get(cur).size(); i++) {
            if (!used.get(cur).contains(i)) {
                String dest = graph.get(cur).get(i);
                ans.add(dest);
                used.get(cur).add(i);
                if (dfs(ans)) {
                    return true;
                }
                ans.remove(ans.size() - 1);
                used.get(cur).remove(i);
            }
        }

        return false;
    }

    public List<String> findItinerary(List<List<String>> tickets) {
        // code
        graph = new HashMap<>(16);
        used = new HashMap<>(16);
        n = tickets.size() + 1;

        for (List<String> ticket : tickets) {
            graph.computeIfAbsent(ticket.get(0), (x) -> new LinkedList<>()).add(ticket.get(1));
            used.put(ticket.get(0), new HashSet<>());
        }

        // sort
        for (String key : graph.keySet()) {
            if (graph.get(key).size() > 1) {
                Collections.sort(graph.get(key));
            }
        }

        List<String> ans = new ArrayList<>();
        ans.add("JFK");
        dfs(ans);

        return ans;
    }
}
