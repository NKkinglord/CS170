// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
public class CodingProblem4_5 {
    static String encrypt(String s, int key){
        if (key<0){
            return null;
        }
        String newString = "";
        for  (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(s.charAt(i))){
                newString = newString + (char)(ch + key);
            } else {
                newString = newString + ch;
            }
        }
        return newString;
    }
    static String decrypt(String s, int key){
        if (key>0){
            return null;
        }
        String newString = "";
        for  (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(s.charAt(i))){
                newString = newString + (char)(ch + key);
            } else {
                newString = newString + ch;
            }
        }
        return newString;
    }
    public static void main(String[] args) {
        System.out.println( encrypt("Hello World!",2));
        System.out.println( decrypt("Jgnnq Vjgtg!",-2));

    }
}
