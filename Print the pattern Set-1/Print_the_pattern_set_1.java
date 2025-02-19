class GfG {
    void printPat(int n) {
        // try to find pattern in given example
    
        // if we iterate on loop in reverse direction the we are able
        // to print value like 2 1
        // for print 2's, in twice we can loop 
        
        for(int i =n; i>0; i--) {
            for(int j =n; j>0; j--) {
                for(int x = i; x>0; x--) {
                    System.out.print(j+" ");
                }
            }
            System.out.print("$");
        }
    }
}