class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int k=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(k!=0) sb.append(c);
                k++;
            }
            else{
                k--;
                if(k!=0) sb.append(c);
            }
        }
        return sb.toString();
    }
}
