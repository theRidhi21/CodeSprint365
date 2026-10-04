class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left=new Stack<>();
        Stack<Integer> star=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                left.push(i);
            }
            else if(ch=='*'){
                star.push(i);
            }
            else{
                if (!left.isEmpty()) {
                    left.pop();
                }
                else if (!star.isEmpty()) {
                    star.pop();
                }
                else {
                    return false;
                }
            }
        }
        while(!left.isEmpty() && !star.isEmpty()) {
            if(star.peek() > left.peek()) {
                left.pop();
                star.pop();
            }
            else {
                return false;
            }
        }
        if(!left.isEmpty()) {
            return false;
        }
        return true;
    }
}

or

  class Solution {
    public boolean checkValidString(String s) {
        int high=0,low=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                high++;low++;
            }
            else if(ch==')'){
                high--;low--;
            }
            else{
                high++;low--;
            }
        if(low<0) low=0;
        if(high<0) return false;
        }
        return low==0;
    }
}
