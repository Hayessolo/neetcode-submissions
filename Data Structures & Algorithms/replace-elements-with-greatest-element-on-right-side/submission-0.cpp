class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int maxsofar = -1;
        int n = arr.size();
        for(int i = n-1; i > -1;i--){
            int cur = arr[i];
            arr[i] = maxsofar;
            maxsofar= max(maxsofar, cur);
        }
        return arr;
    }
};