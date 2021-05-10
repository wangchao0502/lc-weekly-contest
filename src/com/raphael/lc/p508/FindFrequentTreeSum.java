package com.raphael.lc.p508;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-05-10 12:38:52
 */
class FindFrequentTreeSum {
    /**
     * Description for FindFrequentTreeSum:
     * 出现次数最多的子树元素和
     */

    Map<Integer, Integer> record;
    int max = 0;

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int sum = dfs(node.left) + dfs(node.right) + node.val;
        record.put(sum, record.getOrDefault(sum, 0) + 1);

        if (record.get(sum) > max) {
            max = record.get(sum);
        }

        return sum;
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        // code
        record = new HashMap<>(16);
        dfs(root);

        List<Integer> list = new ArrayList<>();

        for (int key : record.keySet()) {
            if (record.get(key) == max) {
                list.add(key);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
