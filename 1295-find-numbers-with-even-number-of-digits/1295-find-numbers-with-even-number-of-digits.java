class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int i=0;
        int k=0;
        int l=nums.length;
      while(i<l)
      {
        c++;
        nums[i]/=10;
        if(nums[i]==0)
        {
              if(c%2==0)
              k++;
              i++;
              c=0;
        }
      }
      return k;
    }
}