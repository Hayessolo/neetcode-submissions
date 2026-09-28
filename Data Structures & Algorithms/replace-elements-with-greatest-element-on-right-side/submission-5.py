class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        gr8 = -1
        for i in range (len(arr)-1,-1,-1):
            temp = arr[i]
            arr[i] = gr8
            gr8 = max(gr8,temp)

        return arr

        