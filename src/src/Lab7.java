// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
import java.util.Arrays;
public class Lab7 {
    static int[] reverseArray(int[] nums){
        int[] temparr = new int[nums.length];
        int j = 0;
        for (int i = nums.length-1; i >= 0; i--){

            temparr[j] = nums[i];
            j++;
        }
        return temparr;
    }
    static double sumArray(double[] nums){
        double sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        return sum;
    }
    static int countPrimesInArray(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (isPrime(nums[i]) ){
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
    static int[] countAlphabets(String s){
        int count[] = new int[27];
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count[s.charAt(i) - 'a']++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));
        double[] arr2 = {1.1,0.9,0.0,5.00};
        System.out.println(sumArray(arr2));
        int[] arr3 = {1,4,5};
        System.out.println(countPrimesInArray(arr3));
        String s = "Hello World!!";
        System.out.println(Arrays.toString(countAlphabets(s)));
    }

}
