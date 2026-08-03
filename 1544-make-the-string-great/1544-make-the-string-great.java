class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i =0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if(!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32)
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        StringBuilder string = new StringBuilder();
        while(!stack.isEmpty())
        {
            string.append(stack.pop());
        }
        return string.reverse().toString();
    }
}