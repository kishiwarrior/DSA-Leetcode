class Solution {
    public int numberOfSubstrings(String s) {
        int last[] = new int[3];
        int count=0;
        Arrays.fill(last,-1);
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            last[ch-'a']=i;
            if(last[0]!=-1 && last[1]!=-1 && last[2]!=-1){
                count+=Math.min(Math.min(last[0],last[1]),last[2])+1;
            }
        }
        return count;
    }
}