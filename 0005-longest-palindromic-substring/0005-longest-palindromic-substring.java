class Solution {
    int maxi = Integer.MIN_VALUE;
    int si = -1;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++)
        {
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return s.substring(si,si+maxi);
    }
    public void expand(String s,int l,int r)
    {
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r))
        {
            if(r-l+1 > maxi)
            {
                maxi = r-l+1;
                si = l;
            }
            l--;
            r++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna