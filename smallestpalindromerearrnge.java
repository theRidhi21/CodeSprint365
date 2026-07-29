class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        String half = s.substring(0, n / 2);
        char[] arr = half.toCharArray();
        Arrays.sort(arr);
        String left = new String(arr);
        String middle = "";
        if (n % 2 == 1) {
            middle = String.valueOf(s.charAt(n / 2));
        }
        String right = new StringBuilder(left).reverse().toString();
        return left + middle + right; 
    }
}
