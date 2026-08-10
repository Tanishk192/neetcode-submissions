class Solution {
    public String longestCommonPrefix(String[] strs) {

        int idx = 0;
        int len = strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(len>strs[i].length()){
                len = strs[i].length();
                idx = i;
            }
        }


        String ans = "";
        String temp = "";

        for(int i=0;i<strs[idx].length();i++){
            int flag = 1;
            for(int j=0;j<strs.length;j++){
                if(j==idx){
                    continue;
                }
                else if(strs[j].charAt(i)!=strs[idx].charAt(i)){
                    flag = 0;
                    j = strs.length;
                }
            }

            if(flag==1){
                temp += strs[idx].charAt(i);
            }
            else{
                ans = temp;
                i = strs[idx].length();
            }
        }

        if(ans.length()<temp.length()){
            ans = temp;
        }

        return ans;
    }
}