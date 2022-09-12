class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stack=new Stack<>();
        
        for(int i=nums.length-1;i>=0;i--){
            stack.push(nums[i]);
        }
        
        for(int i=nums.length-1;i>=0;i--){
            int digit=nums[i];
                while(!stack.isEmpty() && stack.peek()<=nums[i]){
                    stack.pop();
                }
           
            nums[i]=stack.empty()?-1:stack.peek();
            stack.push(digit);
        }
        
        return nums;
    }
}