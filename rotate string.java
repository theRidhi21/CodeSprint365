class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()==goal.length()){
            s=s.concat(s);
            if(s.contains(goal)){
                return true;
            }
        }
        return false;
    }
}
