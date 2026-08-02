class Solution {
    public int smallestRepunitDivByK(int k) {
        int c=0,r=0;
        if(k%2==0 || k%5==0){
            return -1;
        }
        while(c<=k){
            r=((r*10)+1)%k;
            c++;
            if(r==0){
                return c;
            }
        }
        return -1;
    }
}
