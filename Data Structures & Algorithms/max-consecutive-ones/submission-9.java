class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = 0;
        int j =0;
        for (int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                n = Math.max(n,++j);
            }else{
                j=0;
            }
            
        }
        return n;
        
    }
}