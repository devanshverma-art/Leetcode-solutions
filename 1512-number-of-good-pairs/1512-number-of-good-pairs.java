class Solution {
    public int numIdenticalPairs(int[] nums) {
    int count=0;  
    int i=0,j=0;
    int l=nums.length;
     while(i!=l-1)
     {
        if(j==l-1)
        {
            if(nums[i]==nums[j]&&i<j)
            count+=1;
            i++;
            j=i+1;
        }
      else
      {
        if(nums[i]==nums[j]&&i<j)
        {
            count+=1;
            j++;
        }
        else
        j++;
      }
        
     }
     return count;
    }
}