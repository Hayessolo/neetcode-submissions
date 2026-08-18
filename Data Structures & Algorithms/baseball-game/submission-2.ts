class Solution {
    /**
     * @param {string[]} operations
     * @return {number}
     */
    calPoints(operations: string[]): number {
        let scores: number[] = []
        for( const op of operations){
             switch (op){
                case "+":
                    let add:number = scores[scores.length-1] + scores[scores.length -2]
                    scores.push(add)
                    break;
                case "D":
                    let xtwo: number= scores[scores.length-1]*2
                    scores.push(xtwo)
                    break;
                case "C":
                    scores.pop()
                    break;
                default:
                    scores.push(parseInt(op))
            }
        }
         return scores.reduce((a,b) => a+b,0)
    }
}

