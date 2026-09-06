class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            rowSet.clear();
            colSet.clear();
            
            for (int j = 0; j < n; j++) {
                // If .add() returns false, we found a duplicate! Return false immediately.
                if (!rowSet.add(matrix[i][j]) || !colSet.add(matrix[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
