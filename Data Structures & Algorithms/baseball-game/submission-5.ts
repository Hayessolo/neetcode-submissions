class Solution {
    /**
     * @param {string[]} operations
     * @return {number}
     */
    calPoints(operations: string[]): number {
        let scores :number[] =[]
        for(let i :number= 0;i < operations.length;i++){
            
            switch(operations[i]){
                case ("+"):
                    let add:number = scores[scores.length - 1] + scores[scores.length-2] 
                    scores.push(add)
                    break
                case ("D"):
                    let Xtwo:number = 2 * scores[scores.length-1]
                    scores.push(Xtwo)
                    break
                case ("C"):
                    scores.pop()
                    break
                default:
                    scores.push(parseInt(operations[i]))
                    break

            }
        }
        return scores.reduce((a,b) => a+b,0)
    }
}
