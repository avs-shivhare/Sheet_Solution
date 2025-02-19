class Solution {
  public:

    int maxProduct(vector<int>& arr) {
        // 1st method
        // we can solve this question by sorting the give array
        // and multiply last to number
        // which mean after sorting, return product of 
        // n-1th and n-2th element
        // but its time complexity is O(nlogn)
        // and space complexity is O(1)
        
        // solution
        // sort(arr.begin(),arr.end());
        // int n = arr.size();
        // return (long long)arr[n-1]*(long long)arr[n-2];
        
        
        // 2nd method 
        // find the largest and second largest and multiply that
        // finding largest and second largest element are done in O(n)
        // so the time complexity of this solution is O(n)
        // and space complexity is O(1)
        
        // solution
        long long largest = 0,second_largest = 0;
        
        // iterating using for each loop
        for(auto i: arr) {
            if(i > largest) {
                second_largest = largest;
                largest = i;
            }
            else if(i> second_largest) {
                second_largest = i;
            }
        }
        return largest*second_largest;
    }
};