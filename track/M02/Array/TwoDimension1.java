import java.util.Scanner;

public class TwoDimension1 {

    public static void main(String[] args) {
        int a[][] = new int[3][5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Elements :");
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array Elemaents are :");
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
