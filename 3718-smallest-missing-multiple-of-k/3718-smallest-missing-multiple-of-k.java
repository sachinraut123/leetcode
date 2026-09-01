class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        int temp =2;
        int a=k;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(nums[i]==a){
                a= k*temp;
                temp++;
            }
        }
        return a;
    }
}