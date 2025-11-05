// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// Lab Section: 3PM
//
//Partner Name: QinYin Jiang/Jocelyn
//Partner Lab Section: 3PM
//
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
import java.util.Arrays;
public class Question2 {
    static int countPrimes(int numbers[]){
        int count = 0;
        if (numbers.length == 0) return -1;
        for (int i = 0; i < numbers.length; i++) {
            if(isPrime(numbers[i])){
                count++;
            }
        }
        return count;
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
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,5,7,3,5};
        System.out.println(countPrimes(arr));
    }
}
