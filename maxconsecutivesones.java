class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i,temp=0,temp1=0; 
       int l= nums.length;
        for(i=0;i<l;i++)
        {
            if(nums[i]==1)
            {temp++;
                temp1=Math.max(temp,temp1);
            }
            else
            temp=0;
        }
        return temp1;
            }
}
