class Solution {
    public void sortColors(int[] nums) {
      
        if(nums.length==0 || nums.length==1) return;
        
        int start=0;
        int end=nums.length-1;
        int indx=0;
        
        while(indx<=end && start<end){
            
            if(nums[indx]==0){
                nums[indx]=nums[start];
                nums[start]=0;
                start++;
                indx++;
            }
            else if(nums[indx]==2){
                nums[indx]=nums[end];
                nums[end]=2;
                end--;
            }
            else {
                indx++;
            }
        }
    }
}