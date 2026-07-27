class Solution {
    public boolean isPerfectSquare(int num) {
        double b=Math.sqrt(num);
        int k=(int)b;
        double t=b-k;
        if(t==0.0000){
            return true;
        }
        return false;
    }
}
