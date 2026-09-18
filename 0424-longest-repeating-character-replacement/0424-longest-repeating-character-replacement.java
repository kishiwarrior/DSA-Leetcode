class Solution {
    public int characterReplacement(String s, int k) {
        int n[] = new int[26];
        int maxlen=0;
        for ( int i = 0 ; i < 26; i ++) {
            int v=0,l=0,r=0;
            while ( r<s.length()){
                char ch = s.charAt(r);
                //n[ch-'A']++;
                if(ch!=(char)('A'+i)){
                    v++;
                }
                if(v>k){
                    if(s.charAt(l)!=(char)('A'+i)){
                        v--;
                    }
                    if(s.charAt(l)==(char)('A'+i)){
                    }
                        l=l+1;
                    
                }
                if(v<=k){
                    maxlen=Math.max(maxlen,r-l+1);
                }
                r++;
            }
        }
        return maxlen;
    }
}