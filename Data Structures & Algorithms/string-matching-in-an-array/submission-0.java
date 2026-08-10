class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            boolean flag = false;
            for(int j=0;j<words.length;j++){
                if(j==i){
                    continue;
                }
                else if(words[i].length()>words[j].length()){
                    continue;
                }
                else if(words[j].contains(words[i])){
                    flag = true;
                }
            }
            if(flag){
                ans.add(words[i]);
            }
        }

        return ans;
    }
}