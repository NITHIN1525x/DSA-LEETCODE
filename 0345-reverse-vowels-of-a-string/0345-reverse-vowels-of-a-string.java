class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
       int i=0;
       int j=arr.length - 1;
       while(i <=j)
       {
            
            if(!isVowel(arr[i]))
            {
                i++;
            }
            else if(!isVowel(arr[j]))
            {
                j--;
            }
            else
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
        return new String(arr);
    }
    public boolean isVowel(char arr)
    {
        if(arr == 'a' || arr == 'e' ||arr == 'i' ||arr == 'o' ||arr == 'u' ||arr == 'A' ||arr == 'E' ||arr == 'I' ||arr == 'O' ||arr == 'U' )
        {
            return true;
        }
        return false;
    }

}