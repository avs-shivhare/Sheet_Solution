class Solution {
public:
    bool vowel(char x) {
        x = tolower(x);
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') return true;
        return false;
    }
    string reverseVowels(string s) {
        int left = 0,right = s.size()-1;
        while(left < right) {
            if(vowel(s[left]) && vowel(s[right])) {
                swap(s[left],s[right]);
                left++;
                right--;
            }
            else if(vowel(s[left])) {
                right--;
            }
            else left++;
        }
        return s;
    }
};