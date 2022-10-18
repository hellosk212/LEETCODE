class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set =new HashSet<>();
        
        for(Integer i: nums1){
            set.add(i);
            
        }
        
        HashSet<Integer> inter =new HashSet<>();  
        
        for(Integer i:nums2){
            if(set.contains(i))
            inter.add(i); 
        }
        
        int [] res =new int[inter.size()];
        int index=0;
        
        for(int i:inter){
            res[index++]=i;
            
        }
        return res;
        
        
    }
}