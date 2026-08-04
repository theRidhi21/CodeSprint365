class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> a=new ArrayList<>();
        int l=nums.length;
        int i=0;
        Arrays.sort(nums);
        int k=nums[0];
        for(;i<l;i++){
            while(k!=nums[i]){
                a.add(k);k++;
            }
            k++;
        }
        return a;
    }
}
