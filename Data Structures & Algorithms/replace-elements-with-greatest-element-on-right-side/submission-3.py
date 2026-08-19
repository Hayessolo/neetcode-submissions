class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        gr8test = -1
        for i in range(len(arr)-1,-1,-1):
            cur = arr[i]
            arr[i] = gr8test
            gr8test=max(cur,gr8test)
        return arr
        