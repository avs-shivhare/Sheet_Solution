def printPat(n):
    # try to find pattern in given example
    
    # if we iterate on loop in reverse direction the we are able
    # to print value like 2 1
    # for print 2's, in twice we can loop 
    
    for i in range(n,0,-1):
        for j in range(n,0,-1):
            for x in range(i,0,-1):
                print(j,end= " ")
            
        
        print("$",end="")
    