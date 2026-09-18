class Solution {
    /**
     * @param {number[]} students
     * @param {number[]} sandwiches
     * @return {number}
     */
    countStudents(students: number[], sandwiches: number[]): number {
        let total = students.reduce(<Record>(students,student)=>(students[student] += 1,0))
        for (const sandwich of sandwiches){
            if (total[sandwich] > 0){
                total[sandwich] -= 1
            }else{
                break
            }
        }      
        result =total.reduce()
    }
}
