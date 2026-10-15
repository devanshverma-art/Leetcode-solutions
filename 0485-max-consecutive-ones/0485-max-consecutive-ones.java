class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int i=0;i<nums.length;i++){ 
            // c=(nums[i]==1)?c+=1:0;
            if(nums[i]==0){
            c=0;
            continue;
        }
        c+=1;
          
            if(max<c)
            max=c;
    }
    return max;
    }
}