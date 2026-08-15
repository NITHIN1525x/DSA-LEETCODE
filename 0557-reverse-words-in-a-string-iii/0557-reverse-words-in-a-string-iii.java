class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        while(i < arr.length)
        {
            int j = i;
            while(j < arr.length && arr[j] != ' ')
            {
                j++;
            }
            int r = j-1;
            int l = i;
            while(l <= r)
            {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            i = j+1;
        }
        return new String(arr);

    }
}