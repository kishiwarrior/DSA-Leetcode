class Solution {
    public int numberOfSets(int n, int k) {
        long MOD = 1_000_000_007;
        
        long totalPoints = n + k - 1;
        long choicesNeeded = 2 * k;
        
        // If we don't have enough points to even make the choices
        if (totalPoints < choicesNeeded) return 0;
        
        // Calculate nCr: totalPoints Choose choicesNeeded
        long numerator = 1;
        long denominator = 1;
        
        // We only need to loop up to 2k times, making this O(K)
        for (int i = 0; i < choicesNeeded; i++) {
            numerator = (numerator * (totalPoints - i)) % MOD;
            denominator = (denominator * (i + 1)) % MOD;
        }
        
        // (numerator / denominator) % MOD using Modular Inverse
        return (int) ((numerator * modularInverse(denominator, MOD)) % MOD);
    }
    
    // Helper function to handle division under modulo using Fermat's Little Theorem
    private long modularInverse(long n, long M) {
        return power(n, M - 2, M);
    }
    
    private long power(long base, long exp, long M) {
        long res = 1;
        base %= M;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % M;
            base = (base * base) % M;
            exp /= 2;
        }
        return res;
    }
}
