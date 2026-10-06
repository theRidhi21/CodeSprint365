class Solution {
    public String longestPalindrome(String s) {
        int ini = 0, last = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i;int r = i;
            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                if (r - l > last - ini) {
                    ini = l;
                    last = r;
                }
                l--;r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                if (r - l > last - ini) {
                    ini = l;
                    last = r;
                }
                l--;r++;
            }
        }
        return s.substring(ini, last + 1);
    }
}
