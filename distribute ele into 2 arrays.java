class Solution {
    public int[] resultArray(int[] nums) {
        int l =nums.length;
        int arr1[]=new int[l];
        int arr2[]=new int[l];
        int i1=0,i2=0,j=0;
        arr1[i1]=nums[j++];
        arr2[i2]=nums[j++];
        while(j<l){
            if(arr1[i1]>arr2[i2]){
                i1++;
                arr1[i1]=nums[j];
            }
            else{
                i2++;
                arr2[i2]=nums[j];
            }
            j++;
        }
        int i=0;
        int res[]=new int[l];
        while(i<arr1.length){
            if(arr1[i]==0){
                break;
            }
            res[i]=arr1[i];
            i++;
        }
        i1=0;
        while(i<l){
            res[i++]=arr2[i1++];
        }
        return res;
    }
}



or


class Solution {
    public int[] resultArray(int[] nums) {
        int l =nums.length;
        int arr1[]=new int[l];
        int arr2[]=new int[l];
        int i1=0,i2=0,j=0;
        arr1[i1]=nums[j++];
        arr2[i2]=nums[j++];
        while(j<l){
            if(arr1[i1]>arr2[i2]){
                i1++;
                arr1[i1]=nums[j];
            }
            else{
                i2++;
                arr2[i2]=nums[j];
            }
            j++;
        }
        int i=0;
        int res[]=new int[l];
        while(i<=i1){
            res[i]=arr1[i];
            i++;
        }
        int j1=0;
        while(i<l){
            res[i++]=arr2[j1++];
        }
        return res;
    }
}
