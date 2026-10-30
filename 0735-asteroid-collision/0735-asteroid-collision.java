class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> s = new ArrayDeque<>();
        for ( int ast : asteroids) {
            boolean destroyed = false; // incoming asteroid 
            while(!s.isEmpty() && ast<0 && s.peek()>0) {
                if(-ast>s.peek()){
                    s.pop();
                    continue;
                }
                else if(-ast==s.peek()) {
                    destroyed = true;
                    s.pop();
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed) {
                s.push(ast);
            }
        }
        int result[] = new int[s.size()];
        for ( int i = result.length-1; i>=0; i--) {
            result[i] = s.pop();
        }
        return result;
    }
}