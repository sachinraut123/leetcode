
class Solution {
    public void sortColors(int[] nums) {
        
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                a.add(nums[i]);
            }
            if(nums[i]==1){
                b.add(nums[i]);
            }
            if(nums[i]==2){
                c.add(nums[i]);
            }
        }
        int index=0;
        for(int i=0; i<a.size(); i++){
            nums[index++]=a.get(i);

        }
        for(int i=0; i<b.size(); i++){
            nums[index++]=b.get(i);

        }
        for(int i=0; i<c.size(); i++){
            nums[index++]=c.get(i);

        }
        
    }
}
    
