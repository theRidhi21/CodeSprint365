class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l=nums.length,max=nums[0];
        for(int i=0;i<l;i++){
            max=Math.max(max,nums[i]);
            int min=nums[i];
            for(int j=i;j<l;j++){
                min=Math.min(min,nums[j]);
            }
            if((max-min)<=k){
                return i;
            }
        }
        return -1;
    }
}
