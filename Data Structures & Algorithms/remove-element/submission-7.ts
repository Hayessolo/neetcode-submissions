class Solution {
    /**
     * @param {number[]} nums
     * @param {number} val
     * @return {number}
     */
    removeElement(nums: number[], val: number): number {
        let n = nums.length
        let  i = 0
        while(i < n){
        if (nums[i] == val){
            n--
            nums[i] = nums[n]
            
        }else{
            i++
        }
        }
        return n
    }
}
