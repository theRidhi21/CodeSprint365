class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t = "1" + s + "1";
        int n = t.length();
        int ans = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ans++;
        }
        int res = ans;
        for (int i = 1; i < n - 1; ) {
            if (t.charAt(i) == '1') {
                int l1 = i;
                while (i < n && t.charAt(i) == '1') i++;
                int r1 = i - 1;
                if (l1 > 0 && r1 < n - 1 &&
                    t.charAt(l1 - 1) == '0' &&
                    t.charAt(r1 + 1) == '0') {
                    int removed = r1 - l1 + 1;
                    int left = l1 - 1;
                    while (left >= 0 && t.charAt(left) == '0') left--;
                    int leftZeros = l1 - left - 1;
                    int right = r1 + 1;
                    while (right < n && t.charAt(right) == '0') right++;
                    int rightZeros = right - r1 - 1;
                    int gained = leftZeros + removed + rightZeros;
                    res = Math.max(res, ans - removed + gained);
                }
            } else {
                i++;
            }
        }
        return res;
    }
}
