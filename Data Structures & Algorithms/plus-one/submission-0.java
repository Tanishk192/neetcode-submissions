class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1] += 1;
            return digits;
        }

        int flag = 1;
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=9){
                flag = 0;
                break;
            }
        }

        if(flag==0){
            for(int i=digits.length-1; i>=0;i--){
                if(digits[i]==9){
                    digits[i] = 0;
                }
                else{
                    digits[i] += 1;
                    break;
                }
            }

            return digits;
        }

        int[] arr = new int[digits.length+1];

        for(int i=digits.length;i>=1;i--){
            arr[i] = 0;
        }

        arr[0] = 1;

        return arr;
    }
}
