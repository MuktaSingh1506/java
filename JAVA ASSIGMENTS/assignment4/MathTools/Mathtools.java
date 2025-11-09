package assignment4.MathTools;

public class Mathtools {
    public long getFactorial(int n) {
        long result = 1;
        if (n > 1)
            for (int i = 1; i < n; i++)
                result *= i;

        return result;
    }

    public boolean checkPrime(int n) {
        if(n<2) return false;
        if(n%2==0 || n%3==0) return false;
        for(int i=5; i<n; i+=4)
        {
            if(n%i==0) return false;
            i+=2;
            if(i<n && n%i==0) return false;
        }
        return true;
    }
}
