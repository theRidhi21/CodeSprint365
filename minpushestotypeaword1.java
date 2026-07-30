class Solution {
    public int minimumPushes(String word) {
        int l=word.length();int k=0;
        int[] freq = new int[26];
        for(int i = 0; i < l; i++) {
            char c = word.charAt(i);
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        for(int i = 25; i >= 0; i--) { 
            int pushes = (25 - i) / 8 + 1; 
            k += freq[i] * pushes;
        }
        return k;
    }
}
