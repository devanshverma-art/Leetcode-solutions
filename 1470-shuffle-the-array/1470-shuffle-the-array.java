class Solution {
    public int[] shuffle(int[] nums, int n) {
     int x=0,y=0,even=0,i=0,odd=0;
      int l=nums.length;
    int output[]=new int[l];

     if(l%2==0)
     odd=l/2;
     else
     odd=(l/2)+1;
     while (i<l)
     {
    
        if(i%2==0)
        {
           output[i]=nums[even];
            i++;
            even++;
        }
        else
        {
       output[i]=nums[odd];
          i++;
          odd++;
      
       
     }
     }
     return output;
    }
}