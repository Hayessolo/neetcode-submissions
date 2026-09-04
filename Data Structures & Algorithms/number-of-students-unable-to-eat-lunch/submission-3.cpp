class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        unordered_map<int,int> counter;
        for(const auto student: students){
            counter[student]++;
        }
        for (const auto sandwich : sandwiches){
            if(counter[sandwich] > 0){
                counter[sandwich] -= 1;
            }else{
               break; 
            }
        }
        return accumulate(counter.begin(),counter.end(),0,[](int total, const auto counti){
            return total += counti.second;
        });
        
    }
};