class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        map<int,int> counter;
        for(int stud :students){
            if(stud == 0){
                counter[0] += 1;
            }else{
                counter[1] += 1;
            }

        }
        for(int sand : sandwiches){
            if(counter[sand] > 0){
                counter[sand] -= 1;
            }else{
              break;  
            }
        }
        return counter[0] + counter[1];
    }
};