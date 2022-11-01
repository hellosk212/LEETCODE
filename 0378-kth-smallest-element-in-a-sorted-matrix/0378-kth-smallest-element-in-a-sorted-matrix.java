//By using binary search

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0], high = matrix[matrix.length - 1][matrix[0].length - 1] + 1;
        //[lo, hi)
        while(low < high) {
            int mid = low + (high - low) / 2;
            int count = 0,  j = matrix[0].length - 1;
            for(int i = 0; i < matrix.length; i++) {
                while(j >= 0 && matrix[i][j] > mid) j--;
                count += (j + 1);
            }
            if(count < k) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}