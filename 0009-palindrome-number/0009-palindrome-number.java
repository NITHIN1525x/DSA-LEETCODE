class Solution {
    public boolean isPalindrome(int x) {
        // if(x < 0)
        // {
        //     return false;
        // }
        // int original = x;
        // int reverse = 0;
        // while(x > 0)
        // {
        //     int last = x % 10;
        //     reverse = reverse * 10 + last;
        //     x = x/10;
        // }
        // return original == reverse;

        if(x < 0 || x % 10 == 0 && x != 0 )
        {
            return false;
        }
        int rev = 0;
        while(x > rev)
        {
            int last = x % 10;
            rev = rev * 10 + last;
            x = x / 10;
        }
        return x == rev || x == rev/10;
    }
}