import java.util.*;

class Solution {
    public List<Integer> lexicalOrder(int n) {

        List<Integer> result = new ArrayList<>();

        int curr = 1;

        for (int i = 0; i < n; i++) {

            result.add(curr);

            // Try going deeper
            if (curr * 10 <= n) {
                curr = curr * 10;
            }

            // Otherwise move to next number
            else {
                while (curr % 10 == 9 || curr + 1 > n) {
                    curr = curr / 10;
                }

                curr++;
            }
        }

        return result;
    }
}
