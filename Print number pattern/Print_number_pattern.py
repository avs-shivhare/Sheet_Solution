class Solution:
    def printPat(self, n):
        ans = []
        # we need to print n lines in this pattern
        for i in range(n, 0, -1):
            # for each line we need to print i to 1, i times
            for j in range(n, 0, -1):
                # repeatedly adding j digit i times
                for x in range(1, i + 1):
                    ans.append(j)
            ans.append(-1)
        return ans
