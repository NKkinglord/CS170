// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
public class Lab6 {
    static void countCharacters(String a){
        char ch;
        int alph = 0;
        int nums = 0;
        int special = 0;
        String sentence = a.toLowerCase();
        for (int i =0; i<sentence.length(); i++){
            ch = sentence.charAt(i);
            if(ch==' ' || ch == '.'|| ch == '!'|| ch == '?' || ch == ',' ){
                special++;
            } else if (Character.isDigit(ch)) {
                nums++;
            } else {
                alph++;
            }

        }
        System.out.println("Alphabets : " + alph);
        System.out.println("Numbers : " + nums);
        System.out.println("Special : " + special);
    }
    static String reverseWord(String a){
        String word = "";
        char ch;
        for (int i =1; i<=a.length(); i++) {
            ch = a.charAt(a.length() - i);
            if (Character.isLetter(ch)) {
                word += ch;
            }
        }
        return word;
    }
    static String reverseWordinPlace(String a){
        String word = "";
        char ch;
        String sentence = "";
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            if (ch == ' ' || ch == '.' || ch == '!' || ch == '?' || ch == ',') {
                sentence += ch;
            } else {
                while (i < a.length() && ch != ' ' && ch != '.' && ch != '!' && ch != '?' && ch != ',') {
                    word += ch;
                    i++;
                    if (i < a.length()) {
                        ch = a.charAt(i);
                    }
                }
                sentence += reverseWord(word);
                word = "";
                if (i < a.length()) {
                    i--;
                }

            }

        }
        return sentence;
    }
    static boolean searchString(String a,  String word) {

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == word.charAt(0)) {
                String found = "";
                for (int j = 0; j < word.length(); j++) {
                    if (a.charAt(i + j) == word.charAt(j)) {
                        found += word.charAt(j);
                    }
                }
                if (found.equals(word)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        countCharacters("AaBbCcDdEE1234 223AABc");
        System.out.println(reverseWord( "Hello!"));
        System.out.println(reverseWordinPlace( "This is a reverse test!"));
        System.out.println(searchString( "This is a test to see if the test cases are working. Test testing!","test"));
    }
}
