class Solution {
    /**
     * @param {number[]} students
     * @param {number[]} sandwiches
     * @return {number}
     */
    countStudents(students: number[], sandwiches: number[]): number {
        const counter = students.reduce<Record<number,number>> ((students,student)=>{students[student] = (students[student] ||0)+1;return students;},{})
        for (let sandwich of sandwiches){
            if (counter[sandwich] >0){
                counter[sandwich]--
            }else{
                break
            }
        
        }
        let total = Object.values(counter).reduce((a,b)=>a+b,0)
        return total
    }
}
