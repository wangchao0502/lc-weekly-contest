package com.raphael.lc.p992;

/**
 * @author raphael
 * @date 2021-02-09 10:27:15
 */
@SuppressWarnings({"AlibabaClassNamingShouldBeCamel", "AlibabaLowerCamelCaseVariableNaming"})
class SubarraysWithKDistinct {
    /**
     * Description for SubarraysWithKDistinct:
     * K 个不同整数的子数组
     */
    public int subarraysWithKDistinct(int[] A, int K) {
        // code
        return atMostKDistinct(A, K) - atMostKDistinct(A, K - 1);
    }

    /**
     * 最多 k 个不同整数的子数组
     */
    private int atMostKDistinct(int[] A, int K) {
        int n = A.length;
        int left = 0, right = 0;
        // distinct number count
        int count = 0;
        int[] freq = new int[n + 1];
        int ans = 0;

        while (right < n) {
            if (freq[A[right++]]++ == 0) {
                count++;
            }
            // left ptr move
            while (count > K) {
                if (--freq[A[left++]] == 0) {
                    count--;
                }
            }
            ans += right - left;
        }

        return ans;
    }
}
