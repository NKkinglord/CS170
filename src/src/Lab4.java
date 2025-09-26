// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang

public class Lab4
{
    // The first function evenSum(int) should have a single integer as input parameter
    // and return the sum of the digits of the input parameter.
    static int evenSum(int num)
    {
        // Initialize an integer variable called sum to 0
        int sum = 0;
        // Declare an integer variable called digit
        int digits = 0;
        // Define a while loop with the condition that checks whether num is greater than 0
        // The body of the loop will perform the following three tasks
        // 1. Extract and store the last digit from the input parameter num by computing the
        //    remainder of dividing num by 10 into variable digit
        //
        // 2. Compute and store the sum of variable sum and digit into variable sum
        //
        // 3. Update variable num by computing and storing the quotient of dividing variable num
        // by 10 into variable num
        // End while loop
        while (num > 0) {
            digits = num % 10;
            sum += digits;
            num /= 10;
        }
        return sum;
        // Return the variable sum
    }

    // The second function oddCount(int) should have a single integer as input parameter
    // and return the count of the number of digits of the input parameter.
    static int oddCount(int num)
    {
        // Initialize an integer variable called count to 0
        int oddCount = 0;
        // Define a while loop with the condition that checks whether num is greater than 0
        // The body of the loop will perform the following two tasks
        // 1. Increment variable count by 1
        //
        // 2. Update variable num by computing and storing the quotient of dividing variable num
        // by 10 into variable num
        // End while loop
        while (num > 0) {
            oddCount++;
            num /= 10;
        }
        // Return the variable count
        return oddCount;
    }

    // Someone from the math club remembered some concepts from a programming class they took
    // back in the day and has provided you parts of the main() function. You need to complete
    // the missing pieces.
    public static void main(String args[])
    {
        // Declare a variable called number to store the generated random number
        int number;
        // Declare a loop control variable

        // Define a for or while loop that executes 10 times
        for (int i = 0; i < 10; i++)
        {
            // Math club personnel wrote the following
            number = (int)(Math.random()*10000); // generates a random integer
            System.out.println("System generated the random number::"+number);

            // Check and see if number is even or odd
            // If EVEN then
            //    display that number is an even number and the sum of digits of number
            //
            // Otherwise if ODD then
            //    display that number is an odd number and the count of number of digits of number
            if (number % 2 == 0){
                System.out.println(number + " is even");
                System.out.println("Sum of digits of " + number + " is " + evenSum(number));
            } else {
                System.out.println(number + " is odd");
                System.out.println("Count of digits of " + number + " is " + oddCount(number));
            }
            // Math club personnel wrote the following
            System.out.println("\n");
        }
    }
}