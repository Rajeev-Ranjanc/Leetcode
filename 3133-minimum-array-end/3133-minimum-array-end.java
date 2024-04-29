class Solution {
    public long minEnd(int n, int x) {
        /*
        in this problem I'm running a loop n-1 times and declare a varible ans in that We store the x and                 evrytime first we increase the ans by 1 everytime and doing or operation with x and ans and finally
        returned the ans
        */

        long ans=x;
        for(int i=0;i<n-1;i++)
        {
            ans++;
            ans=ans|x;
        }
        return ans;
    }
}