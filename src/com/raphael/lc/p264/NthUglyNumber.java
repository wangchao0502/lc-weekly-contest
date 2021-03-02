package com.raphael.lc.p264;

/**
 * @author Raphael
 * @date 2021-03-01 20:27:38
 */
class NthUglyNumber {
    /**
     * Description for NthUglyNumber:
     * 丑數2
     */
    static class Ugly {
        int[] nums = new int[1690];
        Ugly() {
            nums[0] = 1;
            int ugly, i2 = 0, i3 = 0, i5 = 0;
            for (int i = 1; i < 1690; i++) {
                ugly = Math.min(Math.min(nums[i2] * 2, nums[i3] * 3), nums[i5] * 5);
                nums[i] = ugly;
                if (ugly == nums[i2] * 2) ++i2;
                if (ugly == nums[i3] * 3) ++i3;
                if (ugly == nums[i5] * 5) ++i5;
            }
        }
    }

    public int nthUglyNumber(int n) {
        // code
        Ugly u = new Ugly();
        return u.nums[n - 1];
    }
}
