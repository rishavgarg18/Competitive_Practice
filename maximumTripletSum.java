public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n=A.size();
        ArrayList<Integer> right=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            right.set(i,0);
        }
        // for right part suffix array
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                right.set(i,A.get(i));
            }
            else{
                right.set(i,Math.max(right.get(i+1),A.get(i)));
            }
            // for left part we make set


        }
        for(int i=0;i<n;i++)
            System.out.println(right.get(i));
        return 1;
    }
}
