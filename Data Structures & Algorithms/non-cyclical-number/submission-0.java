class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> val = new HashSet<>();

        while(n!=1){
            if(!val.contains(n)){
                val.add(n);
            }
            else{
                return false;
            }
            int totalsum = 0;

            int dup = n;
            while(dup!=0){
                int digit = dup%10;
                totalsum += digit*digit;
                dup /= 10;
            }
            n = totalsum;
        }

        return true;

    }
}
