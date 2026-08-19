class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int  maxRN = 0;
        int  counter  = 0;
        for( int i: nums){
            if (i != 0){
                counter += 1;
                maxRN = max(maxRN ,counter);
            }else{
                counter =0;
            }
            
        }
        return maxRN;
    }
        
    
};