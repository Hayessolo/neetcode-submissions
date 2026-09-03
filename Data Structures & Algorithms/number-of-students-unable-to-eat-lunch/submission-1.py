class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        k=0
        while students and k < len(students):
            

            i = students.pop(0)

            j = sandwiches.pop(0)

            if i  == j:

                k = 0

            else:

                sandwiches.insert(0,j)

                students.append(i)

                k += 1
        return k

   

        
"""
       count = [0] *2
        for val in students:
            if val == 0:
                count[0] += 1
            else:
                count[1] += 1
                
        for val in sandwiches:
            if count[val] > 0:
                count[val] -= 1
        return count[0] + count[1]
"""
        
                
        
