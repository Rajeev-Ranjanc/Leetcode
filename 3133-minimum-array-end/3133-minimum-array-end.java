class Solution {
    public long minEnd(int n, int x) {

        long ans=x;
        for(int i=0;i<n-1;i++)
        {
            ans++;
            ans=ans|x;
        }
        return ans;
    }
}