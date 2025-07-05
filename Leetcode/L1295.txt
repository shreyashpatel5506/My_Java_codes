class Solution {
    public static int even(int num){
        int digit = 0;
        while (num > 0){
            digit += 1;
            num /=10;
        }
        if(digit%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num :nums) {
                if(even(num)==1){
                    count+=1;
                }
        }
        return count;
    }
}