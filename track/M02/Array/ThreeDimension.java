
import java.util.Scanner;

public class ThreeDimension {

    public static void main(String[] args) {

        int a[][][] = new int[3][5][2];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array Elements :");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = scan.nextInt();
                }
            }
        }

        System.out.println("Array Elements are :");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
