package com.raphael.lc.weekly232.p5702;

/**
 * @author Raphael
 * @date 2021-03-14 10:48:19
 */
class FindCenter {
    /**
     * Description for FindCenter:
     * 找出星型图的中心节点
     */
    public int findCenter(int[][] edges) {
        // code
        int[] e1 = edges[0];
        int[] e2 = edges[1];
        if (e1[0] == e2[0] || e1[0] == e2[1]){
            return e1[0];
        }
        return e1[1];
    }
}
