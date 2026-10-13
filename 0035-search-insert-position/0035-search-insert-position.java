class Solution {
    public int searchInsert(int[] nums, int target) {
       int mid=0;int ub=0;int lb=0;int found=0;
       int n=nums.length;
       lb=0;
       ub=n-1;
       while(lb<=ub)
       {
         mid=(ub+lb)/2;
        if(nums[mid]==target)
        return mid;
        if(nums[mid]>target)
        ub=mid-1;
        if(nums[mid]<target)
         lb=mid+1;
       }
 return lb;
    }
}
