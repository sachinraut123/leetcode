class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int n = weights.length;
        int max = 0;
        int total = 0;

        for(int i=0; i<n; i++){
            max = Math.max(weights[i],max);
            total += weights[i];
        }
        int low = max;
        int high  = total;
        
        
        int ans = 0;

        while(low <= high){
            int sum = 0;
            int day = 1;
            int mid = low+(high-low)/2;

            for(int i=0; i<n; i++){
                if(sum + weights[i]>mid){
                    day++;
                    sum=0;
                }
                sum+=weights[i];
            }
            if(day <= days){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
                
            }
        }
        return ans;
    }
}