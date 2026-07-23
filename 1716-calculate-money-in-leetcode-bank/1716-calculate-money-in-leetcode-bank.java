class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int init=1;
        int result=0;
        for(int i=0; i<n; i++){
            if(i%7==0){
                sum=sum+1;
                init=sum;
            }
            result+=init;
            init++;
            
            
        }
        return result;
        
    }
}