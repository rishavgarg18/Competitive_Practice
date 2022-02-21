import java.util.stream.*;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int max = Integer.MIN_VALUE;
        int x = 0;
        int size = A.size();
        if (B > size) {
            return -1;
        }
        if (B == size) {
            return sumArray(A, 0, size);
        }
        for (int i = 0; i <= B; i++) {
            x = sumArray(A, 0, B - i) + sumArray(A, size - i, size);
            if (x > max) {
                max = x;
            }
        }

        return max;
    }

    public static int sumArray(ArrayList<Integer> al, int start, int last) {
        int sum = 0;
        for (int i = start; i < last; i++) {
            sum += al.get(i);
        }
        return sum;
    }
}
