class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        Arrays.sort(piles);
        int low = 1;
        int high = piles[piles.length-1];
        int middle = 0;
        int ans = 0;

        while(low<=high){
            middle =low+(high-low)/2;
            boolean flag=find(piles,h,middle);
            
            if(flag==true){
                ans = middle;
                high = middle-1;
            }else{
                low = middle+1;
            }
        }
        return ans;
    }


    public boolean find(int [] piles,int h,int speed){
        int hrs = 0;
        for(int i=0; i<piles.length; i++){
            hrs += (piles[i]+speed-1)/speed;
            if(hrs>h){
                return false;
            }
        }
    
        return true;
    }
}