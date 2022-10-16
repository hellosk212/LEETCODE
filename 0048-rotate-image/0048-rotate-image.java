class Solution {
    public void rotate(int[][] mat) {
        transpose(mat);
        reverse(mat);
    }
    
    public void transpose(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = tmp;
            }
        }
    }
    
    public void reverse(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - j - 1] = tmp;
            }
        }
    }
}