class Solution {
    public int romanToInt(String s) {
        int l=s.length();int res=0;
       for(int i=l-1;i>=0;i--){
        char ch=s.charAt(i);
        switch(ch){
            case 'I':res+=1;break;

            case 'V':res+=5;
            if(i!=0 && s.charAt(i-1)=='I'){
                res-=1;i--;
            }break;

            case 'X':res+=10;
            if(i!=0 && s.charAt(i-1)=='I'){
                res-=1;i--;
            }break;

            case 'L':res+=50;
            if(i!=0 && s.charAt(i-1)=='X'){
                res-=10;i--;
            }break;

            case 'C':res+=100;
            if(i!=0 && s.charAt(i-1)=='X'){
                res-=10;i--;
            }break;

            case 'D':res+=500;
            if(i!=0 && s.charAt(i-1)=='C'){
                res-=100;i--;
            }break;

            case 'M':res+=1000;
            if(i!=0 && s.charAt(i-1)=='C'){
                res-=100;i--;
            }break;
        }
       } 
       return res;
    }
}
