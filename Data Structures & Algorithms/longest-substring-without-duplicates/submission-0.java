class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
            }
            else{
                ans.add(st.size());
                st = new HashSet<>();
                st.add(s.charAt(i));
            }
        }

        Collections.sort(ans);

        return ans.get(ans.size()-1);
    }
}
