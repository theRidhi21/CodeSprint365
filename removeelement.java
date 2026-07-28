class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        int i=0;
        while(i<l){
            if(nums[i]!=val){
                i++;
            }
            else{int j=i;
                while(j<l-1){
            nums[j]=nums[j+1];j++;
                }l--;
            }
        }
        return l;
    }
}
