class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int N = nums.length;
        int [] left_product = new int[N];
        int [] right_product = new int[N];
        int [] output_arr = new int[N];
        
        left_product[0]=1;
        right_product[N-1]=1;
        
        
    for(int i=1;i<N;i++){
        left_product[i] = nums[i-1] * left_product[i-1];
    }
    for(int i=N-2;i>=0;i--){
        right_product[i] = nums[i+1] * right_product[i+1];
        
    }
    for(int i=0;i<N;i++){
        output_arr[i] = left_product[i] * right_product[i];
    }
    
    return output_arr;
}
}