runtime : 2ms
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int c=0;int a[]=new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                c++;
                a[i]=c%2;
            }
            else if(ch==')'){
                a[i]=c%2;
                c--;
            }
        }
        return a;
    }
}

or

  runtime : 1ms
  class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int c=0,i=0;int a[]=new int[seq.length()];
        for(char ch : seq.toCharArray()){
            if(ch=='('){
                c++;
                a[i++]=c%2;
            }
            else if(ch==')'){
                a[i++]=c%2;
                c--;
            }
        }
        return a;
    }
}
