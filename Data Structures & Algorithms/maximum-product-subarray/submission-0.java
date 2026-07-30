class Solution {
    public int maxProduct(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int product = 1;
                for(int k=i;k<=j;k++){
                    product *= nums[k];
                }
                list.add(product);
            }
        }

        Collections.sort(list);

        return list.get(list.size()-1);
    }
}
