class Solution:
    def min_time(self, arr1, arr2):
        flag = True
        sum1 = arr1[0]
        sum2 = arr2[0]
        n = len(arr1)

        for i in range(1, n):
            if flag:
                sum1 += arr2[i]
                sum2 += arr1[i]
            else:
                sum1 += arr1[i]
                sum2 += arr2[i]
            flag = not flag

        return min(sum1, sum2)

