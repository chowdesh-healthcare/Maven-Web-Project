// Java Program to check if two  
// given matrices are identical 
  
class GFG 
{ 
    static final int N = 4; 
      
    // This function returns 1 if A[][]  
    // and B[][] are identical 
    // otherwise returns 0 
    static int areSame(int A[][], int B[][]) 
    { 
        int i, j; 
        for (i = 0; i < N; i++) 
            for (j = 0; j < N; j++) 
                if (A[i][j] != B[i][j]) 
                    return 0; 
            return 1; 
    } 
      
