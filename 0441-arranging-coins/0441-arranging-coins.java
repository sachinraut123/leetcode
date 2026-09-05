class Solution {
    public int arrangeCoins(int n) {
        
        long low=0;
        long high=n;
        long ans=0;

        while(low<=high){
            long mid=low+(high-low)/2;
            long val=mid*(mid+1)/2;
            if(val==n){
                return (int) mid;
            }else if(val>n){
                high=mid-1;
            }else{
                ans=mid;
                low=mid+1;
            }
        }
        return (int)(ans);
    }
}