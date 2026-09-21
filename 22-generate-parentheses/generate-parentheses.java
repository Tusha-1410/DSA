import java.util.*;

class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        generate("", 0, 0, n, ans);

        return ans;
    }

    public void generate(String current, int open, int close,
                         int n, List<String> ans) {

        // Base case
        if (current.length() == 2 * n) {
            ans.add(current);
            return;
        }

        // Add opening bracket
        if (open < n) {
            generate(current + "(", open + 1, close, n, ans);
        }

        // Add closing bracket
        if (close < open) {
            generate(current + ")", open, close + 1, n, ans);
        }
    }
}
