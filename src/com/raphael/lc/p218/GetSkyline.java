package com.raphael.lc.p218;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-01 12:39:12
 */
class GetSkyline {
    /**
     * Description for GetSkyline:
     * 天际线问题
     */
    public List<List<Integer>> getSkyline(int[][] buildings) {
        // code
        int n = buildings.length;
        List<List<Integer>> output = new ArrayList<>();

        if (n == 0) return output;
        if (n == 1) {
            output.add(Arrays.asList(buildings[0][0], buildings[0][2]));
            output.add(Arrays.asList(buildings[0][1], 0));
            return output;
        }

        List<List<Integer>> leftSkyline, rightSkyline;
        leftSkyline = getSkyline(Arrays.copyOfRange(buildings, 0, n / 2));
        rightSkyline = getSkyline(Arrays.copyOfRange(buildings, n / 2, n));
        return mergeSkylines(leftSkyline, rightSkyline);
    }

    private List<List<Integer>> mergeSkylines(List<List<Integer>> leftSkyline, List<List<Integer>> rightSkyline) {
        int nl = leftSkyline.size(), nr = rightSkyline.size();
        int pl = 0, pr = 0;
        int currY = 0, leftY = 0, rightY = 0;
        int x, maxY;
        List<List<Integer>> output = new ArrayList<>();

        while ((pl < nl) && (pr < nr)) {
            List<Integer> pointL = leftSkyline.get(pl);
            List<Integer> pointR = rightSkyline.get(pr);

            if (pointL.get(0) < pointR.get(0)) {
                x = pointL.get(0);
                leftY = pointL.get(1);
                pl++;
            } else {
                x = pointR.get(0);
                rightY = pointR.get(1);
                pr++;
            }

            maxY = Math.max(leftY, rightY);
            if (currY != maxY) {
                updateOutput(output, x, maxY);
                currY = maxY;
            }
        }

        appendSkyline(output, leftSkyline, pl, nl, currY);
        appendSkyline(output, rightSkyline, pr, nr, currY);

        return output;
    }

    private void appendSkyline(List<List<Integer>> output, List<List<Integer>> skyline, int p, int n, int currY) {
        while (p < n) {
            List<Integer> point = skyline.get(p);
            int x = point.get(0);
            int y = point.get(1);
            p++;

            if (currY != y) {
                updateOutput(output, x, y);
                currY = y;
            }
        }
    }

    private void updateOutput(List<List<Integer>> output, int x, int y) {
        if (output.isEmpty() || output.get(output.size() - 1).get(0) != x) {
            output.add(Arrays.asList(x, y));
        } else {
            output.get(output.size() - 1).set(1, y);
        }
    }
}
