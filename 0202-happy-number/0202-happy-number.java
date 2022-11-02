class Solution {
    private int getNext(int n) {
        int total=0;
        while(n>0){
            int p=n%10;
            n=n/10;
            total+=p*p;
        }
        return total;
        
    }
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
}
    
