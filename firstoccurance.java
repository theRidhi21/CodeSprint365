class Solution {
    public int strStr(String haystack, String needle) {
        int l1=haystack.length();int l2=needle.length();int i;
        for(i=0;i<=l1-l2;i++){ int j;
                for(j=0;j<l2;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }if(j==l2) return i;
        }
        return -1;
    }
}
