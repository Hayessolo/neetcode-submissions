class Solution:
    def calPoints(self, operations: List[str]) -> int:
        record = []
        for i in range(len(operations)):

            match operations[i]  :
                case "+":
                    record.append(record[-1] + record[-2])
                case "D":
                    record.append(record[-1]*2)
                case "C":
                    record.pop()
                case _:
                    record.append(int(operations[i]))
        return sum(record)
        