package com.raphael.lc.offer11;

/**
 * @author Raphael
 * @date 2021-03-11 10:46:21
 */
class MinArray {
    /**
     * Description for MinArray:
     */
    public int minArray(int[] numbers) {
        // code
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            // 3,4,0,1,2
            // 3,4,5,1,2
            // 4,0,1,2,3
            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right -= 1;
            }
        }
        return numbers[left];
    }
}
