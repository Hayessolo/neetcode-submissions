class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums: number[]): number {
        let maxcount:number = 0
        let count: number =0
        for(const val of nums){
            if (val == 1){
                count += 1
                maxcount = Math.max(maxcount, count )
            }else{
                count = 0
            }
        }
        return maxcount
    }
}
