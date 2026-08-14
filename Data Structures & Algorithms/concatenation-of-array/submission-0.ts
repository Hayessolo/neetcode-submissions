class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums: number[]): number[] {
        let n :number = nums.length
        let ans :number[] = new Array(n*2)
        for(let i:number = 0;i< n;i++){
            ans[i] = nums[i]
            ans[i + n] = nums[i]
        } 
        return ans
    }
}
