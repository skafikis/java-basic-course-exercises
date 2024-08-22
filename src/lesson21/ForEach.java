package lesson21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        Random random = new Random();

        int[] grades = new int[10];
        for (int i=0; i<grades.length; i++){
            grades[i] = random.nextInt(10);
        }

        System.out.println("See result Random");
        for (int i=0; i<grades.length; i++){
            System.out.println(grades[i]);
        }


        System.out.println("\nFor Each");
        for (int grade : grades){
            System.out.println("Your grade is " + grade);
        }

        System.out.println("\nEquals For Each");
        for (int i=0; i<grades.length; i++){
            int grade = grades[i] - 1; // Only difference
            System.out.println("Your grade is " + grade);
        }

        System.out.println("\nNew Example");
        String[][] gradesStudents = new String[3][5];
        gradesStudents [0][0] = "James Potter";
        gradesStudents [0][1] = "9.9";
        gradesStudents [0][2] = "8.78";
        gradesStudents [0][3] = "6.8";
        gradesStudents [0][4] = "7.95";

        gradesStudents [1][0] = "Harry Potter";
        gradesStudents [1][1] = "6.98";
        gradesStudents [1][2] = "7.89";
        gradesStudents [1][3] = "5.45";
        gradesStudents [1][4] = "3.03";

        gradesStudents [2][0] = "Lilian Evans Potter";
        gradesStudents [2][1] = "8.9";
        gradesStudents [2][2] = "8.65";
        gradesStudents [2][3] = "5.98";
        gradesStudents [2][4] = "7.35";

        for (String[] gradesStudent : gradesStudents) {
            for (String grade: gradesStudent){
                System.out.println(grade);
            }
            System.out.println();
        }
    }
}