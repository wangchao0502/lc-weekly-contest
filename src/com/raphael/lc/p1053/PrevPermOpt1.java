package com.raphael.lc.p1053;

/**
 * @author Raphael
 * @date 2021-04-15 11:32:43
 */
class PrevPermOpt1 {
    /**
     * Description for PrevPermOpt1:
     * 交换一次的先前排列
     */
    public int[] prevPermOpt1(int[] arr) {
        // code
        int index = -1;
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                index = i - 1;
                break;
            }
        }

        if (index == -1) return arr;
        int target = index + 1;

        for (int i = index + 1; i < n; i++) {
            if (arr[i] < arr[index] && arr[i] > arr[target]) {
                target = i;
            }
        }

        // swap
        int tmp = arr[index];
        arr[index] = arr[target];
        arr[target] = tmp;

        return arr;
    }
}
