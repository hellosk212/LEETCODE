class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] str= s.toCharArray();
        
        for(int i=0;i<s.length();i++)
        {
           str[indices[i]]=s.charAt(i);
            
        }
        // System.out.println(str);
        
        return String.valueOf(str);
    }
}