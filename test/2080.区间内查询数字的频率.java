/*
 * @lc app=leetcode.cn id=2080 lang=java
 * @lcpr version=30204
 *
 * [2080] 区间内查询数字的频率
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RangeFreqQuery {
    final Map<Integer, List<Integer>> map = new HashMap<>();
    public RangeFreqQuery(int[] arr) {
        for (int a = 0; a < arr.length; a++) {
            map.putIfAbsent(arr[a], new ArrayList<>());
            map.get(arr[a]).add(a);
        }
    }
    
    public int query(int left, int right, int value) {
        List<Integer> a = map.getOrDefault(value, new ArrayList<>());
        int l = lowerBound(a, left);
        int r = upperBound(a, right);

        return r - l;
    }

    private int upperBound(List<Integer> list, int target) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private int lowerBound(List<Integer> pos, int target) {
        int low = 0, high = pos.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (pos.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}

/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */
// @lc code=end



/*
// @lcpr case=start
// ["RangeFreqQuery", "query", "query"][[[12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56]], [1, 2, 4], [0, 11, 33]]\n
// @lcpr case=end

 */

