class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> a=new Stack<>();
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                a.push('(');
            }
            else{
                if(!a.isEmpty()){
                    if(a.pop()=='(') continue;
                }
                else{
                    c++;
                }
            }
        }
        while(!a.isEmpty()){
            a.pop();
            c++;
        }
        return c;
    }
}

or

  class Solution {
    public int minAddToMakeValid(String s) {
        int left=0,right=0;
        for(char c:s.toCharArray()){
            if(c=='(') left++;
            else {
                if(left>0) left--;
                else right++;
            }
        }
        return left+right;
    }
}
