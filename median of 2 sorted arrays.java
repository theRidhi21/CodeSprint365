class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int x[]=new int[m+n];
        int i=0,j=0,k=0,mid=0;double s=0;
        while(j<m && k<n){
            if(nums1[j]<nums2[k]) x[i++]=nums1[j++];
            else x[i++]=nums2[k++];
        }
        while(j<m) x[i++]=nums1[j++];
        while(k<n) x[i++]=nums2[k++];
        if((m+n)%2==0){
            mid=(m+n)/2;
            s=((double)x[mid-1]+x[mid])/2;;
        }
        else {
            mid=(m+n)/2;
            s=x[mid];
        }
        return s;
    }
}
