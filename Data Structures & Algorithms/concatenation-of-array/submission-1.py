class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = []
      #     for i in nums:
      #      ans[i] == nums[i]
        ans = nums + nums
        return ans
        