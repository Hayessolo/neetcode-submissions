class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s: string): boolean {
        let closed :Record<string,string> =  {
            ')':'(',  
            '}':'{', 
            ']':'['
            }

        let open :string [] = new Array()
        for(const c of s){
            if ( c in closed && open.length <= 0){
                if(closed[c] == open[open.length -1]){
                    open.pop()
                }else{
                    return false
                }

            }else{
                open.push(c)
            }
           
        }
        if(open.length > 0){
                return true
            }else{
                return false
            }
    }
}
