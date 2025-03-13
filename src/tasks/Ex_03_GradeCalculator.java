package tasks;

public class Ex_03_GradeCalculator {
    /*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59*/
    public static void main(String[] args) {
        String grade_string = args[0];
        int grade = Integer.parseInt(grade_string);

        String letterGrade = grade>=90 && grade<=100 ? "A" :
                (grade >= 80 && grade <= 89) ? "B":
                (grade >= 70 && grade <= 79) ? "C" :
                (grade >= 60 && grade <= 69) ? "D" :"F";
        System.out.println("Your grade is: " + letterGrade);

    }
}
