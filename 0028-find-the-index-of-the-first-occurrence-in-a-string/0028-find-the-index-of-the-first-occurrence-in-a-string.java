class Solution {
    public int strStr(String haystack, String needle) {
        int[] lps = buildlps(needle);
        int i=0;
        int j=0;
        if(needle.length() == 0)
        {
            return 0;
        }
        while(i<haystack.length())
        {
            if(haystack.charAt(i) == needle.charAt(j))
            {
                i++;
                j++;
            }
            if(j == needle.length())
            {
                return i-j;
            }
            else if(i < haystack.length() && haystack.charAt(i) != needle.charAt(j))
            {
                if(j != 0)
                {
                    j = lps[j-1];
                }
                else
                {
                    i++;
                }
            }
        }
        return -1;
    }
    public int[] buildlps(String needle)
    {
        int[] lps = new int[needle.length()];
        for(int i=0;i<needle.length();i++)
        {
            for(int l=i;l>=1;l--)
            {
                String prefix = needle.substring(0,l);
                String suffix = needle.substring(i-l+1,i+1);
                if(prefix.equals(suffix))
                {
                    lps[i] = l;
                    break;
                }
            }
        }
        return lps;
    }
}