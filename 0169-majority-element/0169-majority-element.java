class Solution {
    public int majorityElement(int[] nums) {
         int cnt=0;
        int candidate=0;
        
        for(int num:nums){

        
        if(cnt==0){
            candidate=num;
            

        }
            if(num==candidate)cnt+=1;
            
            else cnt-=1;
            
        }
        return candidate;
        
    }
}