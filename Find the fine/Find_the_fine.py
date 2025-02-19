class Solution:
    def totalFine(self, date, car, fine):
        ans = 0
        is_even_date = (date % 2 == 0)
        
        for i in range(len(car)):
            if is_even_date and car[i] % 2 == 1:
                ans += fine[i]
            elif not is_even_date and car[i] % 2 == 0:
                ans += fine[i]
        
        return ans

    
  