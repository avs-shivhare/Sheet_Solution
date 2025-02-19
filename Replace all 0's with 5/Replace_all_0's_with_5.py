class Solution:
    def convertFive(self, num):
        temp = str(num)
        result = ''
        for i in temp:
            if i == '0':
                result += '5'
            else:
                result += i
        return int(result)
