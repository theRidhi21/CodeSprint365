class Solution {
    public int maxDepth(String s) {
        int m=0,max=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                m++;
                max=Math.max(max,m);
            }
            else if(c==')'){
                m--;
            }
        }
        return max;
    }
}
