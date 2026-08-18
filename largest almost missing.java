class Solution {
    public int largestInteger(int[] nums, int k) {
        int l = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        if (k == l) {
            int max = nums[0];
            for (int num : nums) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
        if (k == 1) {
            int max = -1;
            for (int num : nums) {
                if (freq.get(num) == 1 && num > max) {
                    max = num;
                }
            }
            return max;
        }
        boolean first = freq.get(nums[0]) == 1;
        boolean last = freq.get(nums[l - 1]) == 1;
        if (first && last) {
            return Math.max(nums[0], nums[l - 1]);
        } 
        else if (first) {
            return nums[0];
        } 
        else if (last) {
            return nums[l - 1];
        }
        return -1;
    }
}
