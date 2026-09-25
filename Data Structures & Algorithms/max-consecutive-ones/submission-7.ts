class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums: number[]): number {
        let count = 0
        let gr8 = 0
        for(const num of nums ){
            if(num == 1){
                count += 1
                gr8 = Math.max(gr8,count)
            }else{
                count = 0
            }
        }
        return gr8
        
    }
}
