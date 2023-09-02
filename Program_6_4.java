import java.util.Scanner;

 class GradeSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        double totalScore = 0.0;
        double averageScore;
        char grade;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter score for Subject " + i + ": ");
            double subjectScore = scanner.nextDouble();
            totalScore += subjectScore;
        }
        averageScore = totalScore / numSubjects;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("\nGrade Sheet for " + studentName + ":");
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
