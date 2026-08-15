class Solution:
    def calPoints(self, operations: List[str]) -> int:
        scores =[]
      
        for i in range(len(operations)):
            if operations[i] != "+" and operations[i] != "C" and operations[i] != "D":
                l = int(operations[i])
                scores.append(l)
               
            elif(operations[i] == "+"):
                scores.append(scores[-1] + scores[-2])
            
            elif(operations[i] == "D"):
                scores.append(scores[-1]*2)
               
            elif(operations[i] == "C"):
                scores.pop()

        return sum(scores)


                
            


        