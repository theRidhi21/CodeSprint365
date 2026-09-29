class Solution {
    public int smallestIndex(int[] nums) {
        int i,s=0,b;
      for(i=0;i<nums.length;i++){
        b=nums[i];s=0;
        while(b>0){
            s=s+(b%10);
            b/=10;
        }
        if(s==i){
            return i;
        }
      }
      return -1;
    }
}
