class Solution {
    public int titleToNumber(String s) {
        int result=0;
        for(char c : s.toCharArray()){
            int p=c-'A'+1;
            result=result*26+p;
            
        }
        return result;
        
    }
}