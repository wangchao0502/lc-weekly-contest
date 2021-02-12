package com.raphael.lc.p119;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-12 11:56:42
 */
class GetRow {
    /**
     * Description for GetRow:
     * 杨辉三角2
     */
    public List<Integer> getRow(int rowIndex) {
        // code
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            row.add((int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return row;
    }
}
