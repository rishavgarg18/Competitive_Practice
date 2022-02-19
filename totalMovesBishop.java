public class Solution {
    public int solve(int A, int B) {
        return Math.min(B-1,A-1)+Math.min(A-1,8-B)+Math.min(8-A,B-1)+Math.min(8-A,8-B);
    }
}
