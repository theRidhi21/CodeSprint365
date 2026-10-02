class Solution {
    void addb(List<String> s,String r,int open,int close,int n) {
        if(r.length()==2*n) {
            s.add(r);
            return;
        }
        if(open<n) {
            addb(s,r+"(",open+1,close,n);
        }
        if(close<open) {
            addb(s,r+")",open,close+1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<>();
        addb(s,"",0,0,n);
        return s;
    }
}
