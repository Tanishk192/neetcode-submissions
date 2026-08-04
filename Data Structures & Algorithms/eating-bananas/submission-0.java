class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 1;

        boolean bool = true;

        while(bool){
            int sum = 0;

            for(int i=0;i<piles.length;i++){
                sum += (piles[i] + k -1)/k;
            }

            if(sum<=h){
                bool = false;
            }
            else{
                k++;
            }
        }

        return k;
    }
}
