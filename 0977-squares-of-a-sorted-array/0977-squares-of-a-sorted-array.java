class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp=0;
        for(int i = 0; i< nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

}