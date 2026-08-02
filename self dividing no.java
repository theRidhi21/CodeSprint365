class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> a= new ArrayList<>();
        int k=left;
        while(k<=right){
            int i=k;boolean valid = true;
            while(i>0){
                int b=i%10;
                i/=10;
                if(b==0 || k%b!=0){
                    valid=false;
                    break;
                }
            }
            if(valid==true){
                a.add(k);}
            k++;
        }
        return a;
    }
}
