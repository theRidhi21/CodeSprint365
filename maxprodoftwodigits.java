class Solution {
    public int maxProduct(int n) {
        int b,m1=0,m2=0;
        while(n>0){
            b=n%10;
            n/=10;
            if(m1<b){
                m2=m1;
                m1=b;
            }
            else if(m2<b){
                m2=b;
            }
        }
        return m1*m2;
    }
}
