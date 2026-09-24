class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        g8t = 0
        for num in nums:
            if num == 1:
                count +=1
                g8t = max(g8t,count) 
            else:
                count =0
        return g8t

            