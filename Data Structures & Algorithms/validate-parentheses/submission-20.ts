class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s: string): boolean {
        const closed : Record<string,string>= {')':'(','}':'{', ']' : '[' } 
        let open :number[]
        for (let c of s ){
            if (c in closed && open.length >0){

            }else {}
        }
  
    }
}
