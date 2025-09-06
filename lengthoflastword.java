class Solution {
    public int[] replaceElements(int[] arr) {
        int l=arr.length;
        int i,n;
        for(i=0;i<l;i++)
        {
            for(n=l/2;n>=0;n--)
            {
                arr[i]=Math.max(arr[i],arr[i+n]);
            }
        }
        return arr;
}
}
