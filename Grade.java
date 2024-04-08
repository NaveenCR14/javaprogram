import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <=n; i++) {
            System.out.print("Enter marks for subject " + i + " (0 to 100): ");
            int marks = sc.nextInt();
            total =total+ marks;
        }
        double averagePercentage = (double) total / n;
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } 
          else if (averagePercentage >= 50) {
            grade = "E";
        }
          else {
            grade = "F";
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
       
    }
}
