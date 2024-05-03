class Solution {
    public int compareVersion(String version1, String version2) {
        /*
        
        */
       String[] str = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int m = str.length;
        int n = str2.length;
        int i = 0;
        while (i < m && i < n) {
            int a = Integer.parseInt(str[i]);
            int b = Integer.parseInt(str2[i]);
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            }
            i++;
        }

        while (i < m) {
            if (Integer.parseInt(str[i]) > 0)
                return 1;
            i++;
        }
        while (i < n) {
            if (Integer.parseInt(str2[i]) > 0)
                return -1;
            i++;
        }
        return 0;
        
    }
}