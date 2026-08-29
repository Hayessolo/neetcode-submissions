class Solution:
    def isValid(self, s: str) -> bool:
        closed ={ ')':'(',  '}':'{'  ,']':'[' }
        open = []
        for c in s:
            if c in closed and len(open)>0:
                if closed[c] == open[-1]:
                    open.pop()                   
                else:
                    return False
            else:
                open.append(c)
        return False if len(open)>0 else True


        