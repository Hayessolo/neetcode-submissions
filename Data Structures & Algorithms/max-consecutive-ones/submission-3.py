class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxRN = 0
        counter = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                counter += 1
                maxRN = max(maxRN ,counter)
            else:
                counter = 0
        return maxRN



        