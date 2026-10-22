class Solution {
    /**
     * @param {number[]} arr
     * @return {number[]}
     */
    replaceElements(arr: number[]): number[] {
        let gr8 = -1
        for (let i = arr.length-1;i>=0;--i){
            let temp = arr[i]
            arr[i] = gr8
            gr8 = Math.max(gr8,temp)


        }
        return arr
    }
}
