class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums: number[]): number {
        let maxRN: number  = 0
        let counter : number = 0
        for( const i in  nums){
            if (nums[i] != 0){
                counter += 1
                maxRN = Math.max(maxRN ,counter)
            }else{
                counter =0
            }
            
        }
        return maxRN
    }
}
