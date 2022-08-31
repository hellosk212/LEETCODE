public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int j = 0; j < s.length(); j++) {
            char p = s.charAt(j);
            if(p == '(' || p == '[' || p == '{') stack.push(p);
            else if(stack.empty()) return false;
            else if(p == ')' && stack.pop() != '(') return false;
            else if(p == ']' && stack.pop() != '[') return false;
            else if(p == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }
}