class Solution:
    def climbStairs(self, n: int,cache ={}) -> int:
        if n == 0:
            return 1
        if n < 0:
            return 0 
        if n in cache:
            return cache[n]  
        
        total = self.climbStairs(n-1,cache) + self.climbStairs(n-2,cache)
        cache[n] = total
        return total