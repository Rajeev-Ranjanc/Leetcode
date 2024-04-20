class Solution {
    public double average(int[] salary) {
        
        Arrays.sort(salary);
        double sal = 0;
        int n = salary.length;
        for(int i = 1 ;i<n-1 ; i++){
            sal+=salary[i];
        }
        
        return sal/(n-2);
    }
}