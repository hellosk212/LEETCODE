class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }
        int target[]=new int [arr.size()];
        for(int i=0;i<nums.length;i++){
            target[i]=arr.get(i);
        }
        return target;
        
        
    }
}