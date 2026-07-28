class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>=k){
                hs.add(nums[i]);
            }
        }

        if(hs.size()==0){
            return nums;
        }

        int[] ans = new int[hs.size()];
        int val = 0;

        for(int x:hs){
            ans[val++] = x;
        }

        return ans;
    }
}
