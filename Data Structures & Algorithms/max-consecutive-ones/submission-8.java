class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int  gr8 = 0;
        for (int num : nums){
            if(num == 1){
                count += 1;
                gr8 = Math.max(gr8, count );
            }else{
                count = 0;
            }
        }
        return gr8;
        
    }
}