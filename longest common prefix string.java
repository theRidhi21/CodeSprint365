lass Solution {
    public String longestCommonPrefix(String[] strs) {
        String p=strs[0];
        int i=1;
        while(i<strs.length){
            while(!strs[i].startsWith(p)){
                p=p.substring(0,p.length()-1);
                if(p.length()==0){
                    p="";
                }
            }
            i++;
        }
        return p;
    }
}
or
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c)
                    return ans.toString();
            }
            ans.append(c);
        }
        return ans.toString();
    }
}
