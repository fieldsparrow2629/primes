/**
 * Two examples of methods for determining whether an int is prime. 
 * You will be asked questions about this code on the loops test.
 * 
 * @author Jon Cooper
 * @version November 18, 2013
 */
public class Primes 
{
    /**
     * Determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime1(int n)
    {
        if(n<2) return false;
        for (int i=2; i<n; i++)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    /**
     * A more efficient way to determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime2(int n)
    {
        if (n < 2) return false;
        else if (n == 2)        return true;
        else if (n % 2==0) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    /**
     * prints out a list of the first limit number of primes
     * 
     * 
     * @param limit, the number of primes it will print
     */
    public static void countLimitPrime(int limit)
    {
        int numPrime = 0;
        int num = 2;
        while(numPrime <= limit)
        {
            if(isPrime2(num))
            {
                System.out.print(num);
                System.out.println();
                numPrime ++;
            }
            num ++;
        }
    }
    
    /**
     * returns the nth prime
     * 
     * 
     * @param nth the nth prime the function will return
     * @return returns the prime at the nth place
     */
    public static int nthPrime(int nth)
    {
        int numPrime = 0;
        int num = 1;
        while(numPrime != nth)
        {
            num ++;
            if(isPrime2(num))
            {
                numPrime ++;
            }
        }
        return num;
    }
    
    /**
     * adds together all the prime numbers below the limit
     * 
     * @param limit, the number that the method will go up to
     * @return the sum of the prime numbers
     */
    public static int sumPrime(int limit)
    {
        int sum = 0;
        for(int i = 2; i < limit; i ++)
        {
            if(isPrime2(i)) sum += i;
        }
        
        return sum;
        
    }
    
    /**
     * adds together the first n number of primes
     * 
     * @param limit the number of primes it will add together
     * @return reutrns the sum of the primes
     */
    public static int sumFirstNth(int limit)
    {
        int sum = 2;
        int numPrimes = 1;
        int i = 3;
        while(numPrimes <= limit)
        {
            if(isPrime2(i)) 
            {
                numPrimes ++;
                sum += i;
            }
            
            i += 2;
        }
        return sum;
    }
    
    /**
     * counts the number of primes below the limit number
     * 
     * @param limit the number the method runs up to
     * @param returns the number of primes
     */
    public static int countPrime(int limit)
    {
        int count = 0;
        for(int i = 2; i <= limit; i++)
        {
           if(isPrime2(i)) count ++; 
        }
        return count;
    }
    
    
    
    public static void main(String[] args)
    {
        // test isPrime1
        System.out.println("Question zero");
        System.out.println( isPrime1(19));
        System.out.println( isPrime1(91));
        System.out.println( isPrime1(643));
        System.out.println();
        
        
        System.out.println( isPrime1(2) );
        System.out.println( isPrime1(9) );
        System.out.println( isPrime1(17) );
        
        // test isPrime2
        System.out.println( isPrime2(2) );
        System.out.println( isPrime2(9) );
        System.out.println( isPrime2(17));
        
        
        // Study the isPrime1 and isPrime2 methods to answer the following:
        
        // 0. Study the method isPrime1. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643.
        
        //    It would check each number from 2 - 18 inclusive for 19, 2 - 642 inclusive for 643,  

        
        // 1. Study the method isPrime2. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643.
        
        //    For 19 it would check 2 and then 3.For 91 it would check 2, then 3,5,7,9. 
        //    For 643 it would check 2, then 3,5,7,9,11,13,15,17,19,21,23,25
        
        
        // 2. The number 15,485,863 is the 1 millionth prime number. Suppose it is 
        //    tested in both isPrime1 and isPrime2 for primality. About how much
        //    faster will isPrime2 finish testing. Show how you determined your answer.
        
        //    Prime1 would have to do 15,485,861 calculations, while Prime2 would do  about 1967 calculations. 
        
        
        
        
        // 3. In isPrime2, why is the limit calculated before the loop rather than
        //    writing the loop as for (int i=3; i<=Math.sqrt(n); i=i+2)?
        
        //    Because if limit is calculated in the loop, the computer has to recalculute the same number every itteration of the loop.
        
        
        // 4. The number 1 is not prime, however both prime function say that it is.
        //    Negative numbers cannot be prime either. Fix each function so that all
        //    ints less than 2 return false.

        
        
        // Write blocks of code that use isPrime2 to solve the following problems:
        
        // 5. Generate a list of the first 50 prime numbers.
        
        // 6. What is the 100th prime? the 1000th? The 12847th?
        //      541,7919,138077
    
        // 7. In the set of integers from 2-1000000, how many are prime?
        //      78498
        
        // 8. What is the sum of the all prime numbers below 1000000
        //      1104303641
        
        // 9. What is the sum of the first 1000 prime numbers?
        //      3690840

        
    }
    
}
