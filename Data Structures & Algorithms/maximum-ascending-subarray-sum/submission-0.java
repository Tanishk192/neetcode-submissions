class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int ans = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum += nums[i];
            }
            else{
                if(ans<sum){
                    ans = sum;
                }
                sum = nums[i];
            }
        }

        if(ans<sum){
            ans = sum;
        }

        return ans;
    }
}