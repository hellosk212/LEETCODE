class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();

                for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 if(i!=j && s.charAt(i)==s.charAt(j)){
                     break;
                 }else if(j==n-1) return i;
             }
         }
        return -1;
        
        
    }
}