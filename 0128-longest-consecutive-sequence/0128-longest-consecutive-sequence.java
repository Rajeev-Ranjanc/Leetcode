class Solution {
    public int longestConsecutive(int[] nums) {
    
          /*
            This is optimal one. Optimal is in certain condition. we put all elements into an unordered set
            so while fetching we can get in O(1) TC. and start iterating over set and if the set contains its
            previous element mean for 101 if there is 100 present then we keep going less if it not contains
            mean for 101 there is no 100 then we again visit 100 from 101 using while loop and keep increasing
            my count which is initialized by 1 and also increase the x(100) and after while loop we store the
            longest sequence using Math.Max method.
            TC: O(3N) in the case when set fetch data into O(1) TC.
         */
        int n = nums.length;

        if (n == 0) {
            return 0;
        }
        int longest = 1;

        //put all element into stack

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int it : set) {
            if (!set.contains(it - 1)) {
                int count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
        
        
//        TC: O(3N)
//        SC: O(N)
        

        
        
        /*
        Although Tc of this is O(n*logn) which is not mentioned in the question in there O(n) tc 
        mentioned so this is better than brute force but not optimal let's see the optimal one
        
        
          /*
            Better Solution can be by Sorting.
            1. Sort
            2. longest = 1; cnt = 0; lastSmaller = MINIMAL Value
            3. check the condition

there is one more condition if nums[i] will be equal to last smaller than we have nothing to do

 First of all sorted the given array and checked if array is empty then return 0. Declared 3 variables  longest seq will at least 1 when array will not be empty and last_Smaller initialized by min val of
integer and another var is count. runs a loop in which I have check if nums[i]-1 is the last_smaller number then that element will be considered in the sequence then count is increased by one and last_
smaller will be that element else if nums[i] == last smaller number then also that element is in the
sequence(duplicate element) like this [1,1,1,1] but we will not increase the count and not update the
last_smaller number.

One last critical point to think if nums[i] != last_smaller element it means I have to change the entire
thing like here 100 occurs in this [1,1,1,1,1,2,3,100,101,102,103,104] in this situation we again make count
1 and last_smaller element become nums[i] and outside this I'm storing the longest sequence till in a variable
            using Math.max which is to be return after process
         
        if(nums.length == 0){
            return 0;
        }
        
       Arrays.sort(nums);
        
        int longest = 1;
        
        int count = 0;
        
        int last_smaller = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] - 1 == last_smaller) {
                
                count++;
                
                last_smaller = nums[i];
                
            } else if (nums[i] != last_smaller) {
                
                count = 1;
                
                last_smaller = nums[i];
                
            }
            
            longest = Math.max(count, longest);
            
        }
        return longest;
        
        */
    }
}