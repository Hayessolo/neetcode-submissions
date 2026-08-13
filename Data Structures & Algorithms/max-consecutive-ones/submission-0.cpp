class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxcount = 0;
        int count =0;
        for (int val:nums){
            if (val == 1){
                count += 1;
                maxcount = max(maxcount, count );
            }else{
                count = 0;
            }
        }
        return maxcount;
    }
        
    
};