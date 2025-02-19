class Solution:
    def triDownwards(self, s):
        # in this problem we have to replace character with dot(.)
        n = len(s)
        ans = "";
        for i in range(0,n):
            # add dot(.) first;
            for j in range(0,i):
                ans += ".";
            # add remain character
            for j in range(i,n):
                ans += s[j];
        return ans;
