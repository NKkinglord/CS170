// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
public class CodingProblem3 {
    public static Boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static Boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                    return false;
            }
        }
            return true;
    }
    public static void displayOddPrimes(int num) {
        for (int i = 0; i < num; i++) {
            if (!isEven(i) && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static int computeNonPrimeSum(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (isEven(i) && !isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        displayOddPrimes(500);
        System.out.print("Sum of non-prime numbers between 1 to 1000 is: ");
        System.out.println(computeNonPrimeSum(1000));
    }
}
