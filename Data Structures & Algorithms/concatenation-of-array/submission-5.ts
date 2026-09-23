class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums: number[]): number[] {
        let n :number =nums.length
        let ans : number []= new Array(2*n)
        for(let i =0;i<n;i +=1){
            ans[n+i] =ans[i] =nums[i]
        }
        return ans
    }
}
