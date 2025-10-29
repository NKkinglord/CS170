// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
public class ExtraCredit1 {
    static void printPattern(int n){
        int[] prev = new int[0];
        for(int i=0;i<n;i++){
            int[] intArr = new int[i+1];
            intArr[0]=1;
            intArr[i]=1;
            for(int j=1;j<i;j++){
                intArr[j]=prev[j-1] + prev[j];
            }
            for (int num : intArr) {
                System.out.print(num + " ");
            }
            prev = intArr;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(10);
    }
}
