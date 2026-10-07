import java.util.*;

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(0, candidates, target, new ArrayList<>());

        return ans;
    }

    void backtrack(int start, int[] candidates, int target,
                   List<Integer> list) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            list.add(candidates[i]);

            backtrack(i, candidates,
                      target - candidates[i], list);

            list.remove(list.size() - 1);
        }
    }
}
