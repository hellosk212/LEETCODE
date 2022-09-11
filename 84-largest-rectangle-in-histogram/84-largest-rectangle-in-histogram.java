class Solution {
    
    static int[] previousSmaller(int a[]) {
		int ans[] = new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for(int i = 0; i<a.length; i++) {
			int e = a[i];
			while(!stack.isEmpty() && a[stack.peek()] >= e) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			} else {
				ans[i] = stack.peek();
			}
			stack.push(i);
		}
		return ans;
	}
    
    
    static int[] nextSmaller(int a[]) {
		int ans[] = new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for(int i = a.length-1; i>=0; i--) {
			int e = a[i];
			while(!stack.isEmpty() && a[stack.peek()] >= e) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = a.length;
			} else {
				ans[i] = stack.peek();
			}
			stack.push(i);
		}
		return ans;
	}
    
    
    public int largestRectangleArea(int a[] ) {
        
        int ps[] = previousSmaller(a);
		int ns[] = nextSmaller(a);
		
		int max = 0;
		for(int i = 0; i<a.length; i++) {
			int width = ns[i]-ps[i]-1;
			int curArea = width * a[i];
			max = Math.max(max, curArea);
		}
		
		return max;
        
    }
}