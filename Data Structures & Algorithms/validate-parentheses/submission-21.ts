class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s: string): boolean {
        const closed : Record<string,string>= {')':'(','}':'{', ']' : '[' } 
        let open :string[] = new Array()
        for (let c of s ){
            if (c in closed && open.length >0){
                if (closed[c] == open[open.length-1]){
                    open.pop()

                }else{
                    return false
                }
            }else {
                open.push(c)
            }
        }
        return open.length>0?false :true
  
    }
}
