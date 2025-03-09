class Solution:
    def numOfUnplacedFruits(self, fruits: List[int], baskets: List[int]) -> int:
        n = len(fruits)
        unplace = 0
        for i in range(0,n):
            flag = False
            for j in range(0,n):
                if baskets[j] >= fruits[i]:
                    baskets[j] = 0;
                    flag = True
                    break
                
            
            if flag == False:
                unplace +=1
        
        return unplace;
        