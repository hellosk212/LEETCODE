class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    
        List<Boolean>ans=new ArrayList<>();
        int []temp=new int[candies.length];
        temp=candies.clone();
        Arrays.sort(temp);
        for(int i=0;i<candies.length;i++){
            
            if(candies[i]+extraCandies >= temp[candies.length-1])
                ans.add(true);
            
            else
                ans.add(false);
        }
        
         return ans;
        
    }
}