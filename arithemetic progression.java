class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length;
        int diff=arr[1]-arr[0],i=l-1;
        while(i>0){
            int diff2=arr[i]-arr[--i];
            if(diff2!=diff){
                return false;
            }
        }
        return true;
    }
}
