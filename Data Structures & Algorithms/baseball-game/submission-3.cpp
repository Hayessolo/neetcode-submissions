class Solution {
public:
    int calPoints(vector<string>& operations) {
        vector<int> scores;
        for( std::string op : operations){
            if(op == "+"){
                int add = scores[scores.size()-1] + scores[scores.size() -2];
                scores.push_back(add);
            }else if (op == "D"){
                int xtwo = scores[scores.size()-1]*2;
                scores.push_back(xtwo);
            }else if(op == "C"){
                scores.pop_back();
            }else{
                scores.push_back(stoi(op));
            }
        }
        return std::accumulate(scores.begin(),scores.end(),0);
         
    }
};