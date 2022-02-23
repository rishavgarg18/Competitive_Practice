public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        if(A.size()<B){
            // if there are less number of elements in A than B, then lighting any one of the lights will give us an answer.
            if(A.indexOf(1)!=-1) return 1;
            else return -1;
        }
        // minDone and maxDone will store the values of the light that was switched on before and the last index where we can see the effect respectively
        int minDone = 0;
        int maxDone = 0;
        // this will traverse and handle the indexes in the array
        int curLight = B-1;
        // this will be our final answer
        int count = 0;
        // while the last light has not been switched on
        while(maxDone<A.size()-1){
            // initially, our curLight is set to the most rightmost possible light that can light up all possible indexes before it. Hence, we come back to ensure we get the rightmost functional light.
            while(A.get(curLight) == 0){
                // if we reach the first light, or the light which was switched on earlier without encountering even a single 1, then it is impossible to light the particular indexes
                if(curLight == 0 || curLight == minDone+1) return -1;
                curLight--;
            }
            // one more light to be turned on
            count++;
            // we set the last light switched on to curLight
            minDone = curLight;
            // this is the index of the last index that could be affected due to the light swithed on
            maxDone = curLight+B-1;
            // we set curLight to maxDone+B, to ensure if we turn it on, all lights in between can be switched on too.
            curLight = Math.min(A.size()-1,maxDone+B);
        }
        // we return the count;
        return count;
    }
}
