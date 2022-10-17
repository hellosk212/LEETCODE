//Two ptr method
class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0, b = 0;
        int n = nums.length;
        while(b < n){
           
            if(nums[a] != 0){
                a++;
                b++; 
            }
            
            else if(nums[b] == 0){
                b++;
            }
            // swap a and b
            else{
                int temp = nums[b];
                nums[b] = nums[a];
                nums[a] = temp;
            }
        }
    }
}