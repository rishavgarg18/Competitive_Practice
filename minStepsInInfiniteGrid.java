public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count=0;
        int x=0;
        for(int i=0;i<A.size()-1;i++){
            x=Math.max(Math.abs(A.get(i)-A.get(i+1)),Math.abs(B.get(i)-B.get(i+1)));
            count+=x;
            
        }
        return count;
    }
}