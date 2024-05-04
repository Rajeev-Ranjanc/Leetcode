class Solution {
    public int numRescueBoats(int[] people, int limit) {
/*
    Just sort the array and checked the condition as we can carry at most 2 people at once,
    so we apply two pointer approach in that first we check first element of the array and after that
    last element of the array and if it is less or equal to the limit then increase the i and decrease the
    j otherwise decrease only j and boats will increase everytime
*/
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int boats = 0;
        while (i <= j) {
            if(people[i] + people[j] <=limit){
                i++;
                j--;
            }
            else 
                j--;
            boats++;
            

        }
        return boats;
        
    }
}