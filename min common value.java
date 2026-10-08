class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int l1=nums1.length,l2=nums2.length;
        while(i<l1 && j<l2){
            if(nums1[i]>nums2[j]) j++;
            else if(nums1[i]<nums2[j]) i++;
            else return nums1[i];
        }
        return -1;
    }
}
