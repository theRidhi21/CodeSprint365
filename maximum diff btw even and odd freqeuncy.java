class Solution {
    public int maxDifference(String s) {
        int[] arr= new int[26];
        for(char c : s.toCharArray()){
        arr[c - 'a']++;}
    int maxOdd=0,minEven=Integer.MAX_VALUE;
    for (int count : arr) {
            if (count == 0) continue; 

            if (count % 2 == 1) {
                maxOdd = Math.max(maxOdd, count);
            } else {
                minEven = Math.min(minEven, count);
            }
        }

        if (maxOdd == 0 || minEven == Integer.MAX_VALUE) {
            return 0;
        }
        return maxOdd - minEven;
}
}
