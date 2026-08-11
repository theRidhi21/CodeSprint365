class Solution {
    public int missingInteger(int[] nums) {
        int l=nums.length;
        int i=1,c=nums[0];
       while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            c+= nums[i];
            i++;
        }
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(c)) {
            c++;
        }

        return c;
    }
}
