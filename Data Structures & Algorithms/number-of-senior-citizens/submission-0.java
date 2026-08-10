class Solution {
    public int countSeniors(String[] details) {
        int[] age = new int[details.length]; 
        int count = 0;


        for(int i=0;i<details.length;i++){
            String temp = "";
            temp += details[i].charAt(11);
            temp += details[i].charAt(12);

            age[i] = Integer.parseInt(temp);
        }

        for(int i=0;i<age.length;i++){
            if(age[i]>60){
                count++;
            }
        }

        return count;
    }
}