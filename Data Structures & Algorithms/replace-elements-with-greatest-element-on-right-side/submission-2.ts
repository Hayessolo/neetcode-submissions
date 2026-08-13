class Solution {
    /**
     * @param {number[]} arr
     * @return {number[]}
     */
    replaceElements(arr: number[]): number[] {
        let maxsofar: number = -1
        let n:number = arr.length
        for(let i :number =n-1;i > -1;i--){
            let cur:number = arr[i]
            arr[i] =maxsofar
            maxsofar = Math.max(maxsofar,cur)
        }
        return arr
    }
}
