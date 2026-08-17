class Solution:
    def calPoints(self, operations: List[str]) -> int:
        scores = []
        for op in operations:
            match op :
                case "+":
                    add = scores[-1] + scores[-2]
                    scores.append(add)
                case "D":
                    xtwo = scores[-1]*2
                    scores.append(xtwo)
                case "C":
                    scores.pop()
                case  _:
                    scores.append(int(op))
        return sum(scores)



        