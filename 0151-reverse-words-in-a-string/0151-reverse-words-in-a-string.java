class Solution {
    public String reverseWords(String s) {
        String[] w = s.trim().split("\\s+");
        Stack<String> stack = new Stack<>();
        for(int i=0;i<w.length;i++)
        {
            stack.push(w[i]);
        }
        String[] h = new String[stack.size()];
        for(int i=0;i<h.length;i++)
        {
            h[i] = stack.pop();
        }
        return String.join(" ",h);
    }
}