
import java.util.Scanner;

public class groupingJT {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int codingScore = scanner.nextInt();
            int attendance = scanner.nextInt();
            int projects = scanner.nextInt();

            if (codingScore >= 60 && (attendance >= 75 || projects >= 2)) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        }
    }
}
