class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        int []visited1 = new int[26];
        int []visited2 = new int[26];
        
        for(char ch : word1.toCharArray()){
            freq1[ch-'a']++;
            visited1[ch-'a'] = 1;
        }
        
        for(char ch : word2.toCharArray()){
            freq2[ch-'a']++;
            visited2[ch-'a'] = 1;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(visited1, visited2) && Arrays.equals(freq1, freq2);
    }
}