class Solution {

    int a[];
    public Solution(int[] nums) {
        a=nums;
        
    }
    
    public int[] reset() {
        return a;
        
        
    }
    
    public int[] shuffle() {
        int []shuffle=a.clone();
        for(int i=shuffle.length-1;i>=0;i--){
            int indx=new Random().nextInt(i+1);
            int temp=shuffle[i];
            shuffle[i]=shuffle[indx];
            shuffle[indx]=temp;
        }
        return shuffle;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */