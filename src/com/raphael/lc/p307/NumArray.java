package com.raphael.lc.p307;

/**
 * @author raphael
 * @date 2021-01-15 22:27:37
 */
class NumArray {
    /**
     * Description for NumArray:
     * 给你一个数组 nums ，请你完成两类查询，其中一类查询要求更新数组下标对应的值，
     * 另一类查询要求返回数组中某个范围内元素的总和。
     */
    int[] tree;
    int n;

    public NumArray(int[] nums) {
        n = nums.length;
        tree = new int[n * 2];
        if (2 * n - n >= 0) {
            System.arraycopy(nums, 0, tree, n, 2 * n - n);
        }
        for (int i = n - 1; i >= 0; i--) {
            tree[i] = tree[i * 2] + tree[i * 2 + 1];
        }
    }

    public void update(int i, int val) {
        int pos = n + i;
        tree[pos] = val;
        while (pos > 0) {
            int left = pos % 2 == 0 ? pos : pos - 1;
            int right = pos % 2 == 0 ? pos + 1 : pos;
            tree[pos / 2] = tree[left] + tree[right];
            pos /= 2;
        }
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        int l = n + i;
        int r = n + j;
        while (r >= l) {
            if (l % 2 == 1) {
                sum += tree[l];
                l++;
            }
            if (r % 2 == 0) {
                sum += tree[r];
                r--;
            }
            l /= 2;
            r /= 2;
        }
        return sum;
    }
}
