class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != '#')
            {
                stack1.push(s.charAt(i));
            }
            else
            {
                if(!stack1.isEmpty())
                {
                    stack1.pop();
                }
                
            }
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while(!stack1.isEmpty())
        {
            s1.append(stack1.pop());
            
        }
        s1.reverse();
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i) != '#')
            {
                stack2.push(t.charAt(i));
            }
            else
            {
                if(!stack2.isEmpty())
                {
                    stack2.pop();
                }
            }
        }
        while(!stack2.isEmpty())
        {
            s2.append(stack2.pop());
            
        }
        s2.reverse();
        return s1.toString().equals(s2.toString());
    }
}