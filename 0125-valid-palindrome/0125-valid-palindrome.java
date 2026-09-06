class Solution {
    public boolean isPalindrome(String s) {
        //pre process it so that we remove white spaces and delimiters
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int l = 0 , r = s.length()-1;
        while ( l <= r ) {
            if ( s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}