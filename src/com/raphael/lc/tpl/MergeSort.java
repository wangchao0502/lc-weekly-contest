package com.raphael.lc.tpl;

/**
 * @author raphael
 * @date 2021-01-31 22:26:00
 */
@SuppressWarnings("AliControlFlowStatementWithoutBraces")
class MergeSort {
    /**
     * Description for MergeSort:
     */
    public void mergeSort(int[] nums, int left, int right, int[] tmp) {
        if (left >= right) return;

        int mid = left + ((right - left) >> 1);
        mergeSort(nums, left, mid, tmp);
        mergeSort(nums, mid + 1, right, tmp);

        int k = 0, i = left, j = mid + 1;
        while (i <= mid && j <= right) {
            if (nums[i] < nums[j]) tmp[k++] = nums[i++];
            else tmp[k++] = nums[j++];
        }

        while (i <= mid) tmp[k++] = nums[i++];
        while (j <= right) tmp[k++] = nums[j++];

        for (i = left, j = 0; i <= right; i++, j++) nums[i] = tmp[j];
    }

    public void sort(int[] nums) {
        if (nums == null) return;
        int[] tmp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, tmp);
    }
}
