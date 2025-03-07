/*approach
  sieve of eranthesis, simulation
  first we calculate the prime numbers till right 
  then from left to right inclusive we search for prime numbers
  now we can run two for loops find the min diff and return but that will return
  n2 + nlogn so to solve efficiently we keep a lastPrime variable if there is a
  lastPrime then we compare the diff of i-lastPrime to that of prev diff and 
  update the num1,num2 if diff < mini else we do nothing and only update lastPrime
  and finally if either of num1,num2 is still the starting value then only one prime is found
  so we return {-1,-1} else we return {num1,num2}*/
class Solution {
    private void sieve(int[] primes){
        for(int i=0;i<primes.length;i++){
            primes[i] = 1;
        }
        primes[0] = primes[1] = 0;
        for(int i=2;i*i<primes.length;i++){
            if(primes[i]==1){
                for(int j=i*i;j<primes.length;j+=i){
                    primes[j] = 0;
                }
            }
        }
    }
    public int[] closestPrimes(int left, int right) {
        int[] primes = new int[right+1];
        sieve(primes);
        int num1 = -1, num2 = -1;
        int mini = 1000000009;
        int lastPrime = -1;
        for(int i=left;i<=right;i++){
            if(primes[i]==1){
                if(lastPrime!=-1){
                    int diff = i - lastPrime;
                    if(diff<mini){
                        mini = diff;
                        num1 = lastPrime;
                        num2 = i;
                    }
                }
                lastPrime = i;
            }
        }
        if(num1==-1 || num2==-1)return new int[]{-1,-1};
        return new int[]{num1,num2};
    }
}
