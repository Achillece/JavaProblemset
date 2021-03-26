package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
    	int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        // ����������߽��򶼿��ԣ��������Ǽ�֦��ǰ��
        Arrays.sort(nums);
        boolean[] used = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(nums, len, 0, used, path, res);
        return res;
    }
    private void dfs(int[] nums, int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; ++i) {
            if (used[i]) {
                continue;
            }

            // ��֦������i > 0 ��Ϊ�˱�֤ nums[i - 1] ������
            // д !used[i - 1] ����Ϊ nums[i - 1] ��������ȱ����Ĺ����иոձ�����ѡ��
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            path.addLast(nums[i]);
            used[i] = true;

            dfs(nums, len, depth + 1, used, path, res);
            // ���ݲ��ֵĴ��룬�� dfs ֮ǰ�Ĵ����ǶԳƵ�
            used[i] = false;
            path.removeLast();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermuteUnique per=new PermuteUnique();
		int[] nums={1,1,2};
		System.out.println(per.permuteUnique(nums));
	}

}
