//Task 1
import java.util.Scanner;
class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSub = scanner.nextInt();
        
        int totalMarks = 0;
    
        for (int i = 1; i <= numSub; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        double averagePercentage = (double) totalMarks / numSub;
      
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
/*Enter the number of subjects: 5
Enter marks for subject 1 (out of 100): 85
Enter marks for subject 2 (out of 100): 95
Enter marks for subject 3 (out of 100): 79
Enter marks for subject 4 (out of 100): 83
Enter marks for subject 5 (out of 100): 91
Total Marks: 433
Average Percentage: 86.6%
Grade: B*/