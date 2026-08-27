class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int ans[]= new int[2];
        int i = 0;
        int j =nums.length-1;
        int idx = -1;

        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid]==target){
                idx = mid;
                j = mid-1;
            }else if(nums[mid]<target){
                i = mid+1;
            }else if(nums[mid]>target){
                j = mid-1;
            }
        }
        int left = 0;
        int right = nums.length-1;
        int idx2=-1;

        while(left<=right){
            int mid = (left+right)/2;        
            if(nums[mid]==target){
                idx2 = mid;
                left = mid+1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else if(nums[mid]>target){
                right =  mid-1;
        }
    }
        ans[0]=idx;
        ans[1]=idx2;
        return ans;
    }
}