class Solution {
    public double myPow(double x, int n) {
        
        return solve(x , (long) n);
//         I made n long because it may be out of Integer Range when power is in negative
        
    }
    public double solve(double x , long n){
//         Base case
        
        if(n == 0){
            return 1;
        }
        
//         if n is negative 
        
        if(n < 0){
            
            x = 1 / x;
            n = -1 * n;
            
        }
        
        double ans = solve(x , n/2);
        
        if(n%2 == 0){
            
            return ans*ans;
            
        }
        
        return ans * ans * x;
        
    }
}