class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        int i=0;
        for(;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    List<Integer> prev=result.get(i-1);
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            result.add(row);
        }
        return result.get(rowIndex);
    }
}
