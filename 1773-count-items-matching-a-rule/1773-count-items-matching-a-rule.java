class Solution {
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int type = 0;
        if (ruleKey.equals("color")) type = 1;
        else if (ruleKey.equals("name")) type = 2;
        int res = 0;
        for (List<String> i : items) {
            if (i.get(type).equals(ruleValue)) res++; 
        }
        return res;
    }
}