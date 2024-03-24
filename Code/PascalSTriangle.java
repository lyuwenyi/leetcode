class PascalSTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            Integer[] row=new Integer[i+1];
            row[0]=1;
            row[i]=1;
            for (int j = 1; j < i; j++) {
                row[j]=res.get(i-1).get(j-1)+res.get(i-1).get(j);
            }
            res.add(List.of(row));
        }
        return res;
    }
}