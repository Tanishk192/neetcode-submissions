class Solution {
    public int maxSubArray(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                List<Integer> al = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    al.add(nums[k]);
                }
                li.add(al);
            }
        }

        List<Integer> sum_li = new ArrayList<>();

        for(int i=0;i<li.size();i++){
            int sum = 0;
            for(int j=0;j<li.get(i).size();j++){
                sum += li.get(i).get(j);
            }
            sum_li.add(sum);
        }

        Collections.sort(sum_li);

        return sum_li.get(sum_li.size()-1);
    }
}
