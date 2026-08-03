class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        int totalsubset = 1<<nums.length;

        for(int i=0;i<totalsubset;i++){
            List<Integer> subset = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j)) > 0){
                    subset.add(nums[j]);
                }
            }
            Collections.sort(subset);
            if(!ans.contains(subset)){
                ans.add(subset);
            }
        }

        return ans;
    }
}
