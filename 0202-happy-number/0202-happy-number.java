class Solution {
    public boolean isHappy(int n) {
        while(n != 1 && n != 4) // n != 4 because it will be cycle 
        {
            int sum = 0;
            while(n > 0)
            {
                int last = n % 10;
                int square = last * last;
                sum = sum + square;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;



        
    }
}