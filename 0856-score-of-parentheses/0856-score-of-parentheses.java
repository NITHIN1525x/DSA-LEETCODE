class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                stack.push("(");
            }
            else
            {
                if(stack.peek().equals("("))
                {
                    stack.pop();
                    stack.push("1");
                }
                else
                {
                    int sum = 0;
                    while(!stack.peek().equals("("))
                    {
                        sum += Integer.parseInt(stack.pop());
                    }
                    stack.pop();
                    stack.push(String.valueOf(sum * 2));
                }
            }
        }
        int ans=0;
        while(!stack.isEmpty())
        {
            ans += Integer.parseInt(stack.pop());
        }
        return ans;
    }
}