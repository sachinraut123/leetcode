class Solution {
    public int maximumCount(int[] nums) {
        
        int i=0;
        int j=nums.length-1;
        int negcount = 0;

        while(i<=j){
            int mid = i+(j-i)/2;
            
            if(nums[mid]<0){
                negcount = mid+1;
                i=mid+1;
            }else{
                j=mid-1;
            
            }
        }
        i=0;
        j=nums.length-1;
        int poscnt=0;
        while(i<=j){
            
            int mid = i+(j-i)/2;
            
            if(nums[mid]>0){
                poscnt = nums.length-mid;
                j=mid-1;
            }else{
                i=mid+1;
            
            }
        }
        return Math.max(negcount,poscnt);
    }
}