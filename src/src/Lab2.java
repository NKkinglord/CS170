// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
public class Lab2 {
    public static void main(String[] args) {
        float subject1 = 95.50f;
        float subject2 = 82.32f;
        float subject3 = 98.99f;
        float averageScore = 0.0f;
        int roundedAverageScore = 0;
        averageScore = (subject1 + subject2 + subject3) / 3;
        roundedAverageScore = (int) averageScore;
        System.out.println("Student score in subject 1 = " + subject1);
        System.out.println("Student score in subject 2 = " + subject2);
        System.out.println("Student score in subject 3 = " + subject3);
        System.out.println("Average score = " + averageScore);
        System.out.println("Rounded average score = " + roundedAverageScore);
    }
}