class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            int val = (int)Math.pow(11, i);

            List<Integer> num = new ArrayList<>();

            while(val!=0){
                num.add(val%10);
                val /= 10;
            }

            ans.add(num);
        }

        return ans;
    }
}