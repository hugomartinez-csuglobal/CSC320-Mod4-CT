import java.util.Scanner;

public class GradeStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        System.out.println("Enter 10 student grades (decimals allowed):");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Grade " + i + ": ");
            double grade = scanner.nextDouble();

            total += grade;

            if (grade > max) {
                max = grade;
            }

            if (grade < min) {
                min = grade;
            }
        }

        double average = total / 10;

        System.out.println("\nGrade Statistics:");
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Highest Grade: %.2f\n", max);
        System.out.printf("Lowest Grade: %.2f\n", min);

        scanner.close();
    }
}
