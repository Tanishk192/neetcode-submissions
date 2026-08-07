class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();
        int sum = 1;
        int flag = 0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else if(nums[i]+1==nums[i+1]){
                sum += 1;
            }
            else{
                flag = 1;
                ans.add(sum);
                sum = 0;
            }
        }

        if(flag==0){
            ans.add(sum);
        }

        Collections.sort(ans);

        return ans.get(ans.size()-1);
    }
}
