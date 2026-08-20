class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int n = nums.length;
        int low = 1;
        int max = 0;
        int ans=0;
        for(int i=0; i<n; i++){
            max = Math.max(nums[i],max);
        }
        int high = max;
        while(low<=high){
            int mid = low+(high-low)/2;
            int sum=0;

            for(int i=0; i<n; i++){
                sum+=(nums[i]+mid-1)/mid;

            }
            if(threshold>=sum){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}