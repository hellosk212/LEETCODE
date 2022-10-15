class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList();
        if (n == 0) {
            answer.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        answer.add("(" + left + ")" + right);
        }
        return answer;
    }
}