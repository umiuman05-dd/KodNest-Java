import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int i = 0;
        int j = a.length - 1;

        // Reverse the array
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

        // Print reversed array
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}

