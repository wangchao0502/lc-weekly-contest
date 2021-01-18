package com.raphael.lc.p721;

import com.raphael.lc.common.UnionFind;

import java.util.*;

/**
 * @author raphael
 * @date 2021-01-18 10:03:49
 */
class AccountsMerge {
    /**
     * Description for AccountsMerge:
     * 给定一个列表 accounts，每个元素 accounts[i] 是一个字符串列表，其中第一个元素 accounts[i][0] 是 名称 (name)，其
     * 余元素是 emails 表示该账户的邮箱地址。
     * 现在，我们想合并这些账户。如果两个账户都有一些共同的邮箱地址，则两个账户必定属于同一个人。请注意，即使两个账户具有相同的名称，它们也可能属于不同的人，因为
     * 人们可能具有相同的名称。一个人最初可以拥有任意数量的账户，但其所有账户都具有相同的名称。
     * 合并账户后，按以下格式返回账户：每个账户的第一个元素是名称，其余元素是按顺序排列的邮箱地址。账户本身可以以任意顺序返回。
     */
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        // code，并查集
        List<List<String>> ans = new ArrayList<>();
        Map<String, Integer> emailIdxMap = new HashMap<>(16);
        Map<Integer, String> idxEmailMap = new HashMap<>(16);
        Map<String, String> emailNameMap = new HashMap<>(16);

        int emailIdx = 0;
        for (List<String> account: accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                if (!emailIdxMap.containsKey(account.get(i))) {
                    emailIdxMap.put(account.get(i), emailIdx);
                    idxEmailMap.put(emailIdx, account.get(i));
                    emailNameMap.put(account.get(i), name);
                    emailIdx++;
                }
            }
        }

        UnionFind uf = new UnionFind(emailIdx);
        for (List<String> account : accounts) {
            for (int i = 2; i < account.size(); i++) {
                uf.union(emailIdxMap.get(account.get(i - 1)), emailIdxMap.get(account.get(i)));
            }
        }

        Map<Integer, Set<String>> rootEmailMap = new HashMap<>(18);
        for (List<String> account: accounts) {
            for (int i = 1; i < account.size(); i++) {
                int root = uf.find(emailIdxMap.get(account.get(i)));
                Set<String> emails = rootEmailMap.getOrDefault(root, new HashSet<>());
                emails.add(account.get(i));
                rootEmailMap.put(root, emails);
            }
        }

        for (Integer root : rootEmailMap.keySet()) {
            String name = emailNameMap.get(idxEmailMap.get(root));
            List<String> emails = new ArrayList<>(rootEmailMap.get(root));
            Collections.sort(emails);
            List<String> list = new ArrayList<>();
            list.add(name);
            list.addAll(emails);
            ans.add(list);
        }

        return ans;
    }
}
