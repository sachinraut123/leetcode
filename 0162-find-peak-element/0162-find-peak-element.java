class Solution {
    public int findPeakElement(int[] nums) {
        
        int i=0;
        int j = nums.length-1;

        if(nums.length ==1) return 0;
        if(nums[i]>nums[i+1]) return i;
        if(nums[j]>nums[j-1]) return j;

        while(i<=j){
            int mid = i+(j-i)/2;

            if(nums[mid]<nums[mid+1]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
    
        return i;
    }
}