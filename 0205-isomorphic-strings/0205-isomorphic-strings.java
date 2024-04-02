class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int[] mp1 = new int[256];
        int[] mp2 = new int[256];
        Arrays.fill(mp1, -1);
        Arrays.fill(mp2, -1);

        int n = s.length();
        for (int i = 0; i < n; i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
/* 
    here I'm cheking is that number is mapped or not if not mapped that means that character is not present     int the second string and we mapped in both way ch1 to ch2 and ch2 to ch1 and we checked are both mapped 
    character are equal or not then return false otherwise universally return true

*/
            if (mp1[ch1] != -1 && mp1[ch1] != ch2 || mp2[ch2] != -1 && mp2[ch2] != ch1)
                return false;
            
            mp1[ch1] = ch2;
            mp2[ch2] = ch1;

        }
        return true;
    }
    
}