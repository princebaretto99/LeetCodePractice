class Solution {
    //https://leetcode.com/problems/count-primes/
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        //
        //  Sieve of Eratosthenes
        //
        for(int i=0;i<primes.length;i++)
            primes[i] = true;
        
        for(int i = 2; i*i < primes.length;i++){
            if(primes[i]){
                for(int j=i;i*j<primes.length;j++){ //Make all multiples false
                    primes[i*j] = false;
                }
            }
        }
        int primeCount = 0;
        for(int i=2;i<primes.length;i++){
            if(primes[i])
                primeCount++;
        }
        
        return primeCount;
    }
}