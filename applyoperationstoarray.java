class Solution {
    public int[] applyOperations(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
         for(int i=0;i<l;i++){
            for(int j=0;j<l-1;j++){
                if(nums[j]==0){
                    nums[j]=nums[j+1];
                    nums[j+1]=0;
                }
            }
        }
        return nums;
    }
}
