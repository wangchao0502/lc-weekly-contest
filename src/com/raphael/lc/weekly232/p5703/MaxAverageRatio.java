package com.raphael.lc.weekly232.p5703;

import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-03-14 10:56:10
 */
@SuppressWarnings("ConstantConditions")
class MaxAverageRatio {
    /**
     * Description for MaxAverageRatio:
     * 最大平均通过率
     */
    private double calPotential(double a, double b) {
        // (b-a)/(b(b+1))
        return (b - a) / (b * (b + 1));
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // code
        double sum = 0;
        int n = classes.length;
        int left = extraStudents;
        double[] scores = new double[n];
        // 大根堆记录人数和增长潜力
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>(n, (o1, o2) -> Double.compare(o2[3], o1[3]));

        for (int i = 0; i < n; i++) {
            double pass = classes[i][0];
            double total = classes[i][1];
            scores[i] = pass / total;
            maxHeap.offer(new double[]{i, pass, total, calPotential(pass, total)});
        }

        while (left > 0) {
            double[] top = maxHeap.poll();
            top[1]++;
            top[2]++;
            top[3] = calPotential(top[1], top[2]);
            scores[(int) top[0]] = top[1] / top[2];
            maxHeap.offer(top);
            left--;
        }

        for (double score : scores) sum += score;

        return sum / n;
    }
}
