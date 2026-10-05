class Solution {
    /**
     * @param {number[]} nums
     * @param {number} val
     * @return {number}
     */
    removeElement(nums: number[], val: number): number {
        let n:number= nums.length
        let i:number = 0
        while (n > i){
            if (nums[i] == val ){
                nums[i] = nums[--n]

            }else{
                i++
            }
        }
        return n
    }
}
