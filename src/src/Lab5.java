// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
public class Lab5 {
    static void StarPattern(int N){
        for(int i=1;i<=N;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void NumberPattern(int N){
        int odd = 1;
        int even = 2;
        for(int i=1;i<=N;i++){
            for(int j=0;j<i;j++){
                if(i%2==0){
                    System.out.print(even +" ");
                    even+=2;
                }
                else{
                    System.out.print(odd +" ");
                    odd+=2;
                }
            }
            System.out.println();
        }
    }
    static void StringPattern(String str){
        for(int i=1;i<=str.length();i++){
            for(int j=0;j<i;j++){
                if(i==j+1){
                    System.out.print(str.charAt(j)+" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StarPattern(5);
        NumberPattern(5);
        StringPattern("Computer Science");
    }
}
