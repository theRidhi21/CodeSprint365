class Solution {
    public boolean sumGame(String num) {
        int l=num.length(),i=0,s1=0,s2=0,c1=0,c2=0;
        while(i<l/2){
            if(num.charAt(i)=='?'){
                c1++;i++;continue;
            }
             s1+= num.charAt(i) - '0';
            i++;
        }
        while(i<l){
            if(num.charAt(i)=='?'){
            c2++;i++;continue;
            }
            s2+= num.charAt(i) - '0';
            i++;
        }
        if(c1==c2){
            return s1!=s2;
        }
        return (c1 + c2) % 2 == 1 || s1 - s2 != 9 * (c2 - c1) / 2;
    }
}
