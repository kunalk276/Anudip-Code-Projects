package stringdemo;

public class PrimeNumber //class
{

    public static void main(String[] args) 
    {
        int n = 1000;
        System.out.println("Prime numbers between 1 and " + n + ":");
        printPrimes(n); // Calling method to print prime no
    }

    
    public static void printPrimes(int n)    // Method to find print prime no
    {
       
        boolean[] primes = new boolean[n + 1];  // array to store number prime or not
        
        
        for (int i = 2; i <= n; i++) // all numbers from 2 to n as prime
        {
            primes[i] = true;
        }

        
        for (int p = 2; p * p <= n; p++) // to find prime numbers
        {
            if (primes[p])
            {
                
                for (int i = p * p; i <= n; i += p)  //all multiples of p as not prime
                {
                    primes[i] = false;
                }
            }
        }

       
        for (int i = 2; i <= n; i++)  // Loop through No from 2 to n to check for primes
        {
            if (primes[i])
            {
                System.out.print(i + " "); // Print prime number
            }
        }
    }
}
