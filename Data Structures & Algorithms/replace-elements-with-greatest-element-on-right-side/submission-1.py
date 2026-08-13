class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        maxsofar= -1
        for i in range(len(arr)-1,-1,-1):
            cur = arr[i]
            arr[i] = maxsofar
            maxsofar = max(maxsofar,cur)

        return arr      
        