class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s: string): boolean {
        let closed :Record<string,string> = {
            ')':'(',
            '}':'{',
            ']':'['
        }
        let open :number[]
        for (let c of s){
            if (c in s && open.length > 0){
                if(closed[c] == open[open.length -1]){}   

            }else{
                open.push(c)
            }
        }
    }
}
