class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1,k=n;
        while(n>0){
            int b=n%10;
            n/=10;
            s+=b;p*=b;
        }
        if(k%(s+p)==0){
            return true;
        }
        else{
            return false;
        }
    }
}
