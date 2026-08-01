class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int add =0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                stack.push(ch);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                else
                {
                    add++;
                }
            }
        }
        return stack.size() + add;
    }
}