class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums: number[]): number {
        let n = 0
        let gr8 = 0
        for (let val of nums){
            if (val === 1){

                gr8 = Math.max(gr8,++n)
            }else{
                n =0
            }
        }
        return gr8
    }
}
