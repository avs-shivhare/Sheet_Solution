class Solution {
  public:
    int convertFive(int num) {
        string temp = to_string(num);
        for(auto &i: temp) {
            if(i == '0') i = '5';
        }
        return stoi(temp);
    }
};

