import java.util.Scanner;

class StudentUtility {
    public void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    public void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public double getPassingPercentage() {
        return 60.0;
    }

    public double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

public class utility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        utility.showReportTitle();
        utility.displayStudent(id, name);

        double averagePercentage = utility.calculatePercentage(javaScore, sqlScore);
        double passingPercentage = utility.getPassingPercentage();

        System.out.println("Percentage: " + averagePercentage);

        if (averagePercentage >= passingPercentage) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        scanner.close();
    }
}