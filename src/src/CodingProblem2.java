// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
public class CodingProblem2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        float a = 3.3f;
        float b = 4.4f;
        char i = 'n';
        char j = 'm';
        System.out.println(intSum(x,y));
        System.out.println(floatSum(a,b));
        System.out.println(charSum(i,j));
    }
    static int intSum(int x, int y){
        return (x+y);
    }
    static float floatSum(float x, float y){
        return (x+y);
    }
    static char charSum(char x, char y){
        return (char) (x+y);
    }

}