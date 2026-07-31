class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length,t=0;
        for(int i=0;i<l;i++){
            if(target==nums[i] || target<=nums[i]){
                break;
            }
            t++;
        }
        return t;
    }
}
