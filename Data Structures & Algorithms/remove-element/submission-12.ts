class Solution {
    /**
     * @param {number[]} nums
     * @param {number} val
     * @return {number}
     */
    removeElement(nums: number[], val: number): number {
        let i =0
        let n = nums.length
        while(i<n){
            if (nums[i] == val){
                nums[i] = nums[--n]

            }else{
                i++
            }
        
        }
        return i
    }
}
