
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        //use odd or even to determine moving up or down, then handle the corner cases (turning point)
        if (matrix.length == 0) return new int[0];
        int r = 0, c = 0, m = matrix.length, n = matrix[0].length, arr[] = new int[m * n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = matrix[r][c];
            //if sum of indices is even
            if ((r + c) % 2 == 0) { // moving up
                if (c == n - 1) 
                { 
                    r++; 
                }
                else if (r == 0)
                { 
                    c++; 
                }
                else
                { 
                    r--; c++;
                }
            } 
            else 
            {   
                //if sum of indices is odd
                // moving down
                if(r == m - 1)
                { 
                    c++; 
                }
                else if (c == 0)
                {
                    r++; 
                }
                else
                {
                    r++; c--; 
                }
            }   
        }   
        return arr;
    }
}