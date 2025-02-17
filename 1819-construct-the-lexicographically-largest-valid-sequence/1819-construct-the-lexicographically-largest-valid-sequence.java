class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] res = new int[2 * n - 1];  // Result array of size (2*n - 1)
        boolean[] used = new boolean[n + 1];  // Track used numbers
        
        backtrack(res, used, n, 0);  // Start backtracking
        return res;
    }

    private boolean backtrack(int[] res, boolean[] used, int n, int index) {
        if (index == res.length) {
            return true;
        }

        if (res[index] != 0) {
            return backtrack(res, used, n, index + 1);
        }


        for (int num = n; num >= 1; num--) {
            if (!used[num]) {
                int secondIdx = (num == 1) ? index : index + num;

                if (secondIdx < res.length && res[secondIdx] == 0) {
                    res[index] = num;
                    res[secondIdx] = num;
                    used[num] = true;

                    if (backtrack(res, used, n, index + 1)) {
                        return true;
                    }

                    res[index] = 0;
                    res[secondIdx] = 0;
                    used[num] = false;
                }
            }
        }

        return false;  
    }
}
