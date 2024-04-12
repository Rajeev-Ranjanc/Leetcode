class Solution {
    public String shiftingLetters(String s, int[] shifts) {
 /*
        in this question at first calculate the sum of the array in which first elements of the 
        string needs to shift upto total sum of array and second elements needs to submit upto 
        total sum - first and so on ,so I have calculated the sum of array from end of the array.
        Then started traversing on the string and also start adding the shifts of in the string of
        i and find the modulo so it cannot go upperbound and always keep in range 1 to 26 and later 
        return the string
*/
        int n = shifts.length - 1;

        for (int i = n - 1; i >= 0; i--) {
            shifts[i] = (shifts[i + 1] + shifts[i]) % 26;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ((arr[i] - 'a' + shifts[i]) % 26 + 'a');
        }
        return new String(arr);
    }
}