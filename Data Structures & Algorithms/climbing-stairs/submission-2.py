class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 1:
            return 1  
        
        n = self.climbStairs(n-1) + self.climbStairs(n-2)

        return n
        