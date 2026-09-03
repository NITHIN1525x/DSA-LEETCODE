class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        for(int i=0;i<grumpy.length;i++)
        {
            if(grumpy[i] == 0)
            {
                sum += customers[i];
            }
        }
        int maxi = 0;
        int window = 0;
        int i=0,j=0;
        while(j < customers.length)
        {
            if(grumpy[j] == 1)
            {
                window += customers[j];
            }
            if((j - i + 1) > minutes)
            {
                if(grumpy[i] == 1)
                {
                    window -= customers[i];
                }
                i++;
            }
            maxi = Math.max(maxi,window);
            j++;
        }
        return maxi + sum;
    }
}