class Solution {
    /**
     * @param {number[]} students
     * @param {number[]} sandwiches
     * @return {number}
     */
    countStudents(students: number[], sandwiches: number[]): number {
    const counter = students.reduce<Record<number,number>>((sandwitches,sandwich) =>{ sandwitches[sandwich] = (sandwitches[sandwich] || 0) +1;return sandwitches;},{})

    for(const sandwich of sandwiches){
        if (counter[sandwich] > 0 ){
            counter[sandwich] -= 1;
        }else{
            break
        }
    }
    return Object.values(counter).reduce((a,b)=> a+b,0)
    }
}
