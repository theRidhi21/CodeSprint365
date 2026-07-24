class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        int a=1;
        while(a<=n){
            a<<=1;
        }
        return a;
    }
}
