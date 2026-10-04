class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int l=nums.length;
        for(int i=0;i<l-1;i++)
        {
        for(int j=i+1;j<l;j++)
        {
           if(nums[i]+nums[j]==target)
           {
            return new int[] {i,j};
           }
        
        }
        }
        return new int[] {};
    }
}

or

    class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<>();
        int j=-1,k=-1;
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(target-nums[i])){
                k=a.get(target-nums[i]);
                j=i;
                return new int[]{j,k};
            }
            a.put(nums[i],i);
        }
        return new int[]{j,k};
    }
}
