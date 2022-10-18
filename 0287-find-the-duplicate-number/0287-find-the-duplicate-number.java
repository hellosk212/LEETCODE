//Bruteforce approach TC=O(N^2)
/*
class Solution {
    public int findDuplicate(int[] nums) {
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    
                    return nums[j];
                }
                
            }
            
           
        }
        return n;
        
    }
}
*/

//Optimized soln 



class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow!=fast);
            slow=nums[0];
        
        
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[fast];
            
        }
        
            return fast; 
        }

    }

