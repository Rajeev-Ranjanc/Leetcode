class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
         String[] a = sentence.split(" ");
       Set<String> set = new HashSet<>(dictionary);
        String ans = "";
        for (int i = 0; i < a.length; i++) {
            ans += findRoot(a[i], set) + " ";
        }
        ans=ans.trim();
        return ans;
        
    }
     public String findRoot(String str, Set<String> set) {
         
        String root = "";
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.substring(0,i))) {
                return root;
            }
            else {
                root+= str.charAt(i);
            }
        }
        return root;
    }
}