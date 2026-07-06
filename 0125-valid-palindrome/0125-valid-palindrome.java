class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if((ch >= 'A' && ch <= 'Z')|| 
            (ch >= 'a' && ch <= 'z') || 
            (ch>='0' && ch <= '9')){
                
                char c=s.charAt(i);
                c=Character.toLowerCase(c);
                res+=c;
                
            }
             
        }
        for(int i=0; i<res.length()/2; i++){
            if(res.charAt(i)!=res.charAt(res.length()-1-i)){
                return false;
            }
        }
        
        return true;
    }
}