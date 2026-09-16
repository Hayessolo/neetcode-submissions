class Solution:
    def climbStairs(self, n: int) -> int:
        steps = n
        c =0
        while steps >0:
            steps -= 1
            if steps > 2:
                steps -= 2
            c +=1

        return c