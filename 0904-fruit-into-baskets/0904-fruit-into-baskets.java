class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,maxlen=0;
        int v=0;
        int maxFruitId = 0;
        for (int f : fruits) {
            maxFruitId = Math.max(maxFruitId, f);
        }
        int[] n = new int[maxFruitId + 1];
        
        while(r<fruits.length){
            if(n[fruits[r]]==0){
                v++;
            }
               
                n[fruits[r]]++;
            
            while(v>2){
                n[fruits[l]]--;
                if(n[fruits[l]]==0)
                v=v-1;
                
                l=l+1;
            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            r++;

        }
        return maxlen;
    }
}