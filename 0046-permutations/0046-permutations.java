class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res= new ArrayList<>();
        backtrack(res,nums,0);
        return res;
        
    }
    public void backtrack(List<List<Integer>> res, int[]nums,int start ){
        
        if(start==nums.length){
            
            res.add(imp(nums));
            
        }
        else{
            for(int i=start;i<nums.length;i++){
                swap(i,start,nums);
                backtrack(res,nums,start+1);
                swap(i,start,nums);
            }
        }
    }
    
    public List<Integer>imp(int[] nums){
        List<Integer> rest=new ArrayList<>();
        for(int i: nums)
            rest.add(i);
        
        
        return rest;
        
        
        
    }
    public void swap(int i,int j,int[] nums){
        
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}