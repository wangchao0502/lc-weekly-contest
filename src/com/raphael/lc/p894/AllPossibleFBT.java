package com.raphael.lc.p894;

import com.raphael.lc.common.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-05-20 12:04:46
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class AllPossibleFBT {
    /**
     * Description for AllPossibleFBT:
     * 所有可能的满二叉树
     */
    Map<Integer, List<TreeNode>> memo = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if (!memo.containsKey(n)) {
            List<TreeNode> ans = new LinkedList<>();
            if (n == 1) {
                ans.add(new TreeNode(0));
            } else if (n % 2 == 1) {
                for (int x = 0; x < n; ++x) {
                    int y = n - 1 - x;
                    for (TreeNode left : allPossibleFBT(x))
                        for (TreeNode right : allPossibleFBT(y)) {
                            TreeNode bns = new TreeNode(0);
                            bns.left = left;
                            bns.right = right;
                            ans.add(bns);
                        }
                }
            }
            memo.put(n, ans);
        }

        return memo.get(n);
    }
}
