class Solution
 {
    public int[] runningSum(int[] nums)
     {
        int n=nums.length;
        int runningsum[]=new int[n];
        int sum=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            runningsum[i]=nums[i];
            else
            sum+=nums[i];
            runningsum[i]=sum;
            
        }
      return runningsum;
 }
 }