class Solution {
    public boolean isSubsequence(String s, String t) {
        int temp = 0; 
        int l1 = s.length();
        int l = t.length();
        
        for (int i = 0, j = 0; i < l && j < l1; i++) {
            if (t.charAt(i) == s.charAt(j)) {
                temp++;
                j++; 
            }
        }
        
        return temp == l1;
    }
}
