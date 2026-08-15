class Solution {
    public boolean isPalindrome(String s) {
        String c = s.toLowerCase().replaceAll("[^a-z0-9]","");
        char[] arr = c.toCharArray();
        int i=0;
        int j=arr.length -1;
        while(i <= j)
        {
            if(arr[i] != arr[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}