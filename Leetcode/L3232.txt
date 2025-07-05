class Solution {
    public static  int digitnumber(int num){
        int digit = 0;
        while(num>0){
            digit += 1;
            num /=10;
        }
        if(digit == 2){
            return 1;
        }else{
            return 0;
        }
    }

    public boolean canAliceWin(int[] nums) {
        int DoubleNum = 0;
        int SingleNum=0;
        for(int num : nums){
            if (digitnumber(num) == 1){
                DoubleNum += num;
            }else{
                SingleNum += num;
            }
        }
        if(DoubleNum == SingleNum){
            return false;
        }else{
            return true;
        }
    }
}