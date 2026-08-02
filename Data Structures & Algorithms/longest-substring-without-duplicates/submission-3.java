class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        HashSet<Character> st = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
            }
            else{
                ans.add(st.size());
                st = new HashSet<>();
                int j = i - 1;
                while (j >= 0 && s.charAt(j) != s.charAt(i)) {
                    st.add(s.charAt(j));
                    j--;
                }
                st.add(s.charAt(i));
            }
        }
        ans.add(st.size());

        Collections.sort(ans);

        return ans.get(ans.size()-1);
    }
}
