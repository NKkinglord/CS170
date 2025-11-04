import java.util.Arrays;

// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
import java.util.Arrays;
public class CodingProblem6_7 {

    static boolean findWord(String words[], String word) {
        for (int i = 0; i < words.length; i++){
            if (words[i].equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }
    static double[] sortNumbers(double numbers[], boolean reverse){
        if (reverse){
            return BubbleSort(numbers);
        } else {
            return reBubbleSort(numbers);
        }
    }
    static double[] reBubbleSort(double arr[])
    {
        int i,j;
        double temp;
        for(i = 0; i < arr.length - 1; i++)
        {
            for( j = 0; j < arr.length -1 - i ; j++){
                if ( arr[j] > arr[j+1] )
                {

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    static double[] BubbleSort(double arr[])
    {
        int i,j;
        double temp;
        for(i = 0; i < arr.length - 1; i++)
        {
            for( j = 0; j < arr.length -1 - i ; j++)
            {
                if ( arr[j] < arr[j+1] )
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    static String[] sortWords(String words[], boolean reverse){
        if (reverse){
            return BubbleSort(words);
        } else {
            return reBubbleSort(words);
        }
    }
    static String[] reBubbleSort(String arr[])
    {
        int i,j;
        String temp;
        for(i = 0; i < arr.length - 1; i++)
        {
            for( j = 0; j < arr.length -1 - i ; j++){
                if ( arr[j].compareTo( arr[j+1] ) > 0 )
                {

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    static String[] BubbleSort(String arr[])
    {
        int i,j;
        String temp;
        for(i = 0; i < arr.length - 1; i++)
        {
            for( j = 0; j < arr.length -1 - i ; j++)
            {
                if ( arr[j].compareTo( arr[j+1] )<0)
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
       double numbers[] = {1,55,-99,24,-25};
        System.out.println(Arrays.toString(sortNumbers(numbers, false)));
       String words[] = {"Apple","Ant","antelope","Zebra"};
        System.out.println(Arrays.toString(sortWords(words, false)));
    }
}
