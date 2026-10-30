class Solution {
    public int[] nextGreaterElements(int[] n) {
        Deque<Integer> s = new ArrayDeque<>();
        int size = n.length;
        int nge[] = new int[size];
        for ( int i = size * 2 - 1; i>=0 ; i--) {
            int ind = i % size;
            while(!s.isEmpty() && s.peek()<=n[ind]){
                s.pop();
            }
            if(i<size){
            if(s.isEmpty()) {
                nge[i] = -1;
            }
            else {
                nge[i] = s.peek();
            }}
            s.push(n[ind]);
        }
        return nge;
    }
}