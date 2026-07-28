class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-1;j++){
                if(nums[j]==0){
                    nums[j]=nums[j+1];
                    nums[j+1]=0;
                }
            }
        }
    }
}
