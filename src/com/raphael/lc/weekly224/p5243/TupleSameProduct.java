package com.raphael.lc.weekly224.p5243;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-01-17 10:42:14
 */
class TupleSameProduct {
    /**
     * Description for TupleSameProduct:
     * 返回a*b=c*d元组数量
     */
    public int tupleSameProduct(int[] nums) {
        // code
        // 2,3,4,6 -> 8 -> 一定是8的倍数，因为一组可以有2*2*2个组合
        // FourSum，剪支，二分查找
        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                int multi = nums[i] * nums[j];
                for (int k = i + 1; k < j; k++) {
                    if (multi % nums[k] != 0) {
                        continue;
                    }
                    int target = multi / nums[k];
                    int left = k + 1;
                    int right = j - 1;
                    while (left <= right) {
                        int mid = left + ((right - left) >> 1);
                        if (nums[mid] > target) {
                            right = mid - 1;
                        } else if (nums[mid] < target) {
                            left = mid + 1;
                        } else {
                            count++;
                            break;
                        }
                    }
                }
            }
        }

        return count * 8;
    }
}
