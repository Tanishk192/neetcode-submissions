class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int val = 0;

        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                val = i;
                break;
            }
        }

        return val;
    }
}
