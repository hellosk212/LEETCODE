class Solution {
    public int balancedStringSplit(String s) {
        int bal=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            
            if(cur=='L'){
                cnt++;
                
            }
            else if(cur=='R'){
                cnt--;
                
            }
            
                    if(cnt==0){
                        bal++;
}
}
                    return bal;
            
        
        
        
    }
}