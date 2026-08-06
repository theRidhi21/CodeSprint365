class Solution {
    public int smallestNumber(int n, int t) {
        int k,b,c,i=n,r=0;
        while(i>=n){
            k=i;c=1;
            while(k>0){
                b=k%10;
                k/=10;
                c*=b;
            }
            if(c%t==0){
                r=i;break;
            }
            i++;
        }
        return r;
    }
}
