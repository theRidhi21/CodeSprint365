class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
            if(nums[i]==target){
                a.add(i);
            }
            i++;
        }
        return a;
    }
}

or

  class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> a=new ArrayList<>();int s=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target) s++;
            else if(nums[i]==target) c++;
        }
        for(int i=0;i<c;i++){
            a.add(s+i);
        }
        return a;
    }
}
