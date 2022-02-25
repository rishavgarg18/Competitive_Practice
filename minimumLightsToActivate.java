public class Solution {
    public int solve(ArrayList < Integer > A, int B) {
        int i = 0;
        int count = 0;
        int n = A.size();
        while (i < n) {
            int right = Math.min(i + B - 1, n - 1);
            int left = Math.max(i - B + 1, 0);
            boolean bulbFound = false;
            while (right >= left) {
                if (A.get(right) == 1) {
                    bulbFound = true;
                    break;

                }
                right--;
            }
            if (!bulbFound) {
                return -1;
            }
            count++;
            i = right + B;
        }
        return count;
    }}