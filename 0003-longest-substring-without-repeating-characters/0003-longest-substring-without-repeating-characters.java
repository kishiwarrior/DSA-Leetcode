class Solution {
    public int lengthOfLongestSubstring(String s) {
        //we will use a hashmap to track the occurred letters and use indexing l < map[s[r]] to check if we need to consider it in the current string window or not
        Map<Character,Integer> map = new HashMap<>();
        int l=0,r=0,maxlen=0;
        while(r<s.length()){
            char f=s.charAt(r);
            if(!map.containsKey(f)){
                map.put(f,r);  
            }
            else{
                if(map.get(f)>=l){
                    l=map.get(f)+1;
                    
                }
                map.put(f,r);
            }
            int len=r-l+1;
            r++;
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;
    }
}