class Solution {
    public int maxProduct(int[] nums) {
        int l=nums.length;int max=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int b=(nums[i]-1)*(nums[j]-1);
                if(max<b){
                    max=b;
                }
            }
        }
        return max;
    }
}
