class Solution {
  public:
    // Function returns the second
    // largest elements
    int getSecondLargest(vector<int> &arr) {
        int largest = -1e9,second_largest = -1e9;
        for(auto i: arr) {
            if(i > largest) {
                second_largest = largest;
                largest = i;
            }
            else if(i > second_largest && i < largest) {
                second_largest = i;
            }
        }
        if(second_largest == -1e9) return -1;
        return second_largest;
    }
};