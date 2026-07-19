class Solution {
    public boolean isPalindrome(int x) {
       int i,rev=0,t=x,c=0;
       for(i=0;t>0;i++){
        c++;
        t/=10;
       }
       t=x;
       for(i=c-1;t>0;i--){
        int b=t%10;
        t=t/10;
        rev+=(int)(b*Math.pow(10,i));//type casting as pow gives float
       }
       if(x==rev){
        return true;
       }
        else {
            return false;
       } 
    }
}
OR
    class Solution {
    public boolean isPalindrome(int x) {
       int i,rev=0,t=x;
       while(t>0){
        int b=t%10;
        t=t/10;
        rev=rev*10+b;
       }
       if(x==rev){
        return true;
       }
        else {
            return false;
       } 
    }
}
