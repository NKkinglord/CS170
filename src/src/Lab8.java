// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
import java.util.Arrays;
public class Lab8 {
    static String[] createStringArray(String sentence){
        sentence = sentence.trim();
        char[] words = sentence.toCharArray();
        String word = "";
        int count = 0;
        boolean found = true;
        for(int i = 0; i < words.length; i++){
            if (Character.isLetter(words[i])){
                found = true;
            } else if (found){
                count++;
                found = false;
            }
        }
        String[] result = new String[count];
        int j = 0;
        for(int i = 0; i < words.length; i++){
            if (Character.isLetter(words[i])){
                word += words[i];
                found = true;
            } else if (found){
                result[j] = word;
                j++;
                word = "";
                found = false;
            }
        }
        return result;
    }
    static boolean searchArray(String arr[],String word){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(word)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createStringArray( "This is a test sentence! It works?")));
        System.out.println(Arrays.toString(createStringArray( " This is a test also. !")));
        String[] arr1 = {"This", "is", "a", "test", "sentence", "It", "works"};
        String word1 = "is";
        System.out.println(searchArray(arr1, word1));

        String[] arr2 = {"This", "is", "a", "test", "sentence", "It", "works"};
        String word2 = "hello";
        System.out.println(searchArray(arr2, word2));
    }

}
