class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int nxt_max = -1;
                if(nums1[i]==nums2[j] && j!=nums2.length-1){
                    for(int k=j;k<nums2.length-1;k++){
                        if(nums2[j]<nums2[k+1]){
                            nxt_max = nums2[k+1];
                            k = nums2.length;
                        }
                    }
                    ans[i] = nxt_max;
                    j=nums2.length;
                }
                else if(nums1[i]==nums2[j] && j==nums2.length-1){
                    ans[i] = nxt_max;
                }
            }
        }

        return ans;
    }
}