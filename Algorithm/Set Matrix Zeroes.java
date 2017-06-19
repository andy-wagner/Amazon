public class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean[] ms = new boolean[m];
        
        boolean[] ns = new boolean[n];
        
        for(int i = 0; i < m; i++){
            
            for(int j = 0; j < n; j++){
            
                if(matrix[i][j] == 0){
                    
                    ms[i] = true;
                    
                    ns[j] = true;
                }
                
            }
        }
        
        for(int i = 0; i < m; i++){
            
            for(int j = 0; j < n; j++){
            
                if(ms[i] || ns[j]){
                    
                    matrix[i][j] = 0;
                }
                
            }
        }
    }
}
