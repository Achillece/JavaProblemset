package test;

/*
 * @lc app=leetcode id=1742 lang=java
 *
 * [1742] Maximum Number of Balls in a Box
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int res = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int box = 0, x = i;
            while (x != 0) {
                box += x % 10;
                x /= 10;
            }
            count.put(box, count.getOrDefault(box, 0) + 1);
            res = Math.max(res, count.get(box));
        }
        return res;
    }
}
// @lc code=end

